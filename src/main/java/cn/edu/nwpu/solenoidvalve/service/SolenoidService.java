package cn.edu.nwpu.solenoidvalve.service;

import cn.edu.nwpu.solenoidvalve.domain.dto.SolenoidDTO;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName ConstDualSystemService
 * @Author: wkx
 * @Date: 2019/7/20 10:04
 * @Version: v1.0
 * @Description: 液发仿真接口
 */
public interface SolenoidService {
    /**
     *
     * @param solenoidDTO
     * @return 电磁阀仿真
     */
    Map<String, List<Double>> solenoidSim(SolenoidDTO solenoidDTO);

    void saveSolenoid(SolenoidDTO solenoidDTO);

    SolenoidDTO findSolenoidByName(String solenoidName);

    List<SolenoidDTO> findAllSolenoid();

}
