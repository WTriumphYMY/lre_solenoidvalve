package cn.edu.nwpu.solenoidvalve.repository;

import cn.edu.nwpu.solenoidvalve.domain.po.SolenoidPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName SolenoidRepository
 * @Author: wkx
 * @Date: 2019/10/27 11:13
 * @Version: v1.0
 * @Description:
 */
@Repository
public interface SolenoidRepository extends JpaRepository<SolenoidPO, Integer> {
    /**
     * 按名称查找
     * @param solenoidName 电磁阀名称
     * @return
     */
    SolenoidPO findBySolenoidName(String solenoidName);

    /**
     * 查找所有电磁阀
     * @return
     */
    List<SolenoidPO> findAll();
}
