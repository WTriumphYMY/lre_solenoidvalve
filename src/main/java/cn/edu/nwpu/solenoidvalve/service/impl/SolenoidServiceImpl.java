package cn.edu.nwpu.solenoidvalve.service.impl;


import cn.edu.nwpu.solenoidvalve.algorithm.SolenoidValveCalc;
import cn.edu.nwpu.solenoidvalve.domain.DO.SimpleLiquidOrifice;
import cn.edu.nwpu.solenoidvalve.domain.DO.SolenoidvalveDO;
import cn.edu.nwpu.solenoidvalve.domain.dto.SolenoidDTO;
import cn.edu.nwpu.solenoidvalve.domain.po.SolenoidPO;
import cn.edu.nwpu.solenoidvalve.factory.MediumFactory;
import cn.edu.nwpu.solenoidvalve.repository.SolenoidRepository;
import cn.edu.nwpu.solenoidvalve.service.SolenoidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName ConstDualSystemServiceImpl
 * @Author: wkx
 * @Date: 2019/7/20 10:04
 * @Version: v1.0
 * @Description: 液发仿真实现
 */
@Service
public class SolenoidServiceImpl implements SolenoidService {

    @Autowired
    private SolenoidRepository solenoidRepository;

    @Override
    public Map<String, List<Double>> solenoidSim(SolenoidDTO solenoidDTO) {
//        double calTime = Double.parseDouble(solenoidDTO.getGlobalParasTime());
//        double timeStep = Double.parseDouble(solenoidDTO.getGlobalParasStep());
//
//        SolenoidvalveDO solenoidvalveDO = transformDTOtoDO(solenoidDTO);
//        SolenoidValveCalc solenoidValveCalc = new SolenoidValveCalc(solenoidvalveDO);
//
//        double pin = Double.parseDouble(solenoidDTO.getPin());
//        double qin = Double.parseDouble(solenoidDTO.getQin());
//        double time = 0.0;
//        List<Double> t = new ArrayList<>();
//        t.add(time);
//        while (time < calTime){
//            solenoidValveCalc.execute(time,  pin, qin);
//            time += timeStep;
//            t.add(time);
//        }
//        Map<String, List<Double>> resultMap = new HashMap<>();
//        resultMap.put("t", t);
//        resultMap.put("p", solenoidValveCalc.getP());
//        resultMap.put("phi", solenoidValveCalc.getPhi());
//        resultMap.put("psi", solenoidValveCalc.getPsi());
//        resultMap.put("q", solenoidValveCalc.getQ());
//        resultMap.put("v", solenoidValveCalc.getV());
//        resultMap.put("x", solenoidValveCalc.getX());
        return null;
    }

    @Override
    public void saveSolenoid(SolenoidDTO solenoidDTO) {
        SolenoidPO solenoidPO = transformDTOtoPO(solenoidDTO);
        solenoidRepository.save(solenoidPO);
    }

    @Override
    public SolenoidDTO findSolenoidByName(String solenoidName) {
        SolenoidPO solenoidPO = solenoidRepository.findBySolenoidName(solenoidName);
        SolenoidDTO solenoidDTO = transformPOtoDTO(solenoidPO);
        return solenoidDTO;
    }

    private SolenoidDTO transformPOtoDTO(SolenoidPO solenoidPO) {
        SolenoidDTO solenoidDTO = new SolenoidDTO();
        solenoidDTO.setComponentName(solenoidPO.getSolenoidName());
        solenoidDTO.setFuelSolenoidN(String.valueOf(solenoidPO.getSolenoidN()));
        solenoidDTO.setFuelSolenoidD(String.valueOf(solenoidPO.getSolenoidD()));
        solenoidDTO.setFuelSolenoidF(String.valueOf(solenoidPO.getSolenoidF()));
        solenoidDTO.setFuelSolenoidK(String.valueOf(solenoidPO.getSolenoidK()));
        solenoidDTO.setFuelSolenoidM(String.valueOf(solenoidPO.getSolenoidM()));
        solenoidDTO.setFuelSolenoidR(String.valueOf(solenoidPO.getSolenoidR()));
        solenoidDTO.setFuelSolenoidSigma(String.valueOf(solenoidPO.getSolenoidSigma()));
        solenoidDTO.setFuelSolenoidSm(String.valueOf(solenoidPO.getSolenoidSm()));
        solenoidDTO.setFuelSolenoidU(String.valueOf(solenoidPO.getSolenoidU()));
        solenoidDTO.setFuelSolenoidXstop(String.valueOf(solenoidPO.getSolenoidXstop()));
        solenoidDTO.setFuelLiquidOrificeD(String.valueOf(solenoidPO.getLiquidOrificeD()));
        solenoidDTO.setFuelLiquidOrificePc(String.valueOf(solenoidPO.getLiquidOrificePc()));
        return solenoidDTO;
    }

    @Override
    public List<SolenoidDTO> findAllSolenoid() {
        List<SolenoidPO> solenoidPOList = solenoidRepository.findAll();
        List<SolenoidDTO> solenoidDTOList = new ArrayList<>();
        for (SolenoidPO solenoidPO : solenoidPOList) {
            solenoidDTOList.add(transformPOtoDTO(solenoidPO));
        }
        return solenoidDTOList;
    }

    private SolenoidPO transformDTOtoPO(SolenoidDTO solenoidDTO) {
        SolenoidPO solenoidPO = new SolenoidPO();
        solenoidPO.setSolenoidName(solenoidDTO.getComponentName());
        solenoidPO.setSolenoidN(Double.parseDouble(solenoidDTO.getFuelSolenoidN()));
        solenoidPO.setSolenoidD(Double.parseDouble(solenoidDTO.getFuelSolenoidD()));
        solenoidPO.setSolenoidF(Double.parseDouble(solenoidDTO.getFuelSolenoidF()));
        solenoidPO.setSolenoidK(Double.parseDouble(solenoidDTO.getFuelSolenoidK()));
        solenoidPO.setSolenoidM(Double.parseDouble(solenoidDTO.getFuelSolenoidM()));
        solenoidPO.setSolenoidR(Double.parseDouble(solenoidDTO.getFuelSolenoidR()));
        solenoidPO.setSolenoidSigma(Double.parseDouble(solenoidDTO.getFuelSolenoidSigma()));
        solenoidPO.setSolenoidSm(Double.parseDouble(solenoidDTO.getFuelSolenoidSm()));
        solenoidPO.setSolenoidU(Double.parseDouble(solenoidDTO.getFuelSolenoidU()));
        solenoidPO.setSolenoidXstop(Double.parseDouble(solenoidDTO.getFuelSolenoidXstop()));
        solenoidPO.setLiquidOrificeD(Double.parseDouble(solenoidDTO.getFuelLiquidOrificeD()));
        solenoidPO.setLiquidOrificePc(Double.parseDouble(solenoidDTO.getFuelLiquidOrificePc()));
        return solenoidPO;
    }

    private SolenoidvalveDO transformDTOtoDO(SolenoidDTO solenoidDTO) {
//        SimpleLiquidOrifice simpleLiquidOrifice = new SimpleLiquidOrifice(MediumFactory.getLiquidData(solenoidDTO.getLiquidData()));
//        simpleLiquidOrifice.setD(Double.parseDouble(solenoidDTO.getLiquidOrificeD()));
//        simpleLiquidOrifice.setPressureCoefficience(Double.parseDouble(solenoidDTO.getLiquidOrificePc()));
//        SolenoidvalveDO solenoidvalveDO = new SolenoidvalveDO(MediumFactory.getLiquidData(solenoidDTO.getLiquidData()),simpleLiquidOrifice);
        return null;
    }

}
