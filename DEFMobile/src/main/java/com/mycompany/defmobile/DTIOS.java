/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

/**
 *
 * @author NguyenMinhTam
 */
public class DTIOS extends DTDD {

    private String OSVersion;

    public DTIOS(String masp, String tensp, double boNhoTrong, double giaNhap, double giaBan, String OSVersion, boolean isNhapKhau) {
        this.setMasp(masp);
        this.setTensp(tensp);
        this.setBoNhoTrong(boNhoTrong);
        this.setGiaNhap(giaNhap);
        this.setGiaBan(giaBan);
        this.OSVersion = OSVersion;
        this.setNhapKhauInfo(isNhapKhau);

    }

    public String getOSVersion() {
        return this.OSVersion;
    }

    public void setOSVersion(String version) {
        this.OSVersion = version;
    }

}
