package cn.edu.nwpu.solenoidvalve.domain.po;

import javax.persistence.*;

/**
 * @ClassName SolenoidPO
 * @Author: wkx
 * @Date: 2019/10/27 10:47
 * @Version: v1.0
 * @Description: 电磁阀持久化类
 */
@Entity
@Table(name = "tb_solenoid")
public class SolenoidPO {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer pkId;
    @Column(name = "solenoid_name")
    private String solenoidName;
    @Column(name = "solenoid_r")
    private Double solenoidR;
    @Column(name = "solenoid_n")
    private Double solenoidN;
    @Column(name = "solenoid_u")
    private Double solenoidU;
    @Column(name = "solenoid_sigma")
    private Double solenoidSigma;
    @Column(name = "solenoid_sm")
    private Double solenoidSm;
    @Column(name = "solenoid_k")
    private Double solenoidK;
    @Column(name = "solenoid_m")
    private Double solenoidM;
    @Column(name = "solenoid_f")
    private Double solenoidF;
    @Column(name = "solenoid_d")
    private Double solenoidD;
    @Column(name = "solenoid_xstop")
    private Double solenoidXstop;
    @Column(name = "liquidorifice_d")
    private Double liquidOrificeD;
    @Column(name = "liquidorifice_pc")
    private Double liquidOrificePc;


    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getSolenoidName() {
        return solenoidName;
    }

    public void setSolenoidName(String solenoidName) {
        this.solenoidName = solenoidName;
    }

    public Double getSolenoidR() {
        return solenoidR;
    }

    public void setSolenoidR(Double solenoidR) {
        this.solenoidR = solenoidR;
    }

    public Double getSolenoidN() {
        return solenoidN;
    }

    public void setSolenoidN(Double solenoidN) {
        this.solenoidN = solenoidN;
    }

    public Double getSolenoidU() {
        return solenoidU;
    }

    public void setSolenoidU(Double solenoidU) {
        this.solenoidU = solenoidU;
    }

    public Double getSolenoidSigma() {
        return solenoidSigma;
    }

    public void setSolenoidSigma(Double solenoidSigma) {
        this.solenoidSigma = solenoidSigma;
    }

    public Double getSolenoidSm() {
        return solenoidSm;
    }

    public void setSolenoidSm(Double solenoidSm) {
        this.solenoidSm = solenoidSm;
    }

    public Double getSolenoidK() {
        return solenoidK;
    }

    public void setSolenoidK(Double solenoidK) {
        this.solenoidK = solenoidK;
    }

    public Double getSolenoidM() {
        return solenoidM;
    }

    public void setSolenoidM(Double solenoidM) {
        this.solenoidM = solenoidM;
    }

    public Double getSolenoidF() {
        return solenoidF;
    }

    public void setSolenoidF(Double solenoidF) {
        this.solenoidF = solenoidF;
    }

    public Double getSolenoidD() {
        return solenoidD;
    }

    public void setSolenoidD(Double solenoidD) {
        this.solenoidD = solenoidD;
    }

    public Double getSolenoidXstop() {
        return solenoidXstop;
    }

    public void setSolenoidXstop(Double solenoidXstop) {
        this.solenoidXstop = solenoidXstop;
    }

    public Double getLiquidOrificeD() {
        return liquidOrificeD;
    }

    public void setLiquidOrificeD(Double liquidOrificeD) {
        this.liquidOrificeD = liquidOrificeD;
    }

    public Double getLiquidOrificePc() {
        return liquidOrificePc;
    }

    public void setLiquidOrificePc(Double liquidOrificePc) {
        this.liquidOrificePc = liquidOrificePc;
    }
}
