package cn.edu.nwpu.solenoidvalve.controller;

import cn.edu.nwpu.solenoidvalve.domain.dto.SolenoidDTO;
import cn.edu.nwpu.solenoidvalve.service.SolenoidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ClientController
 * @Author: wkx
 * @Date: 2019/7/20 09:44
 * @Version: v1.0
 * @Description: 客户端Controller对外暴露接口
 */
@RestController
public class SolenoidController {

    @Autowired
    private SolenoidService solenoidService;


    @PostMapping("solenoidSim")
    public Map<String, List<Double>> solenoidSim(@RequestBody SolenoidDTO solenoidDTO){
        return solenoidService.solenoidSim(solenoidDTO);
    }

    @PostMapping("saveSolenoid")
    public void savaSolenoid(@RequestBody SolenoidDTO solenoidDTO){
        solenoidService.saveSolenoid(solenoidDTO);
    }

    @PostMapping("findSolenoidByName")
    public SolenoidDTO findSolenoidByName(@RequestBody String solenoidName){
        return solenoidService.findSolenoidByName(solenoidName);
    }

    @PostMapping("findAllSolenoid")
    public List<SolenoidDTO> findAllSolenoid(){
        return solenoidService.findAllSolenoid();
    }
}
