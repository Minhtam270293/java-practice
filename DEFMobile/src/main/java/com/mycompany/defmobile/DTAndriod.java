/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

/**
 *
 * @author NguyenMinhTam
 */
public class DTAndriod extends DTDD {

    private String hangSX;
    private double boNhoRam;

    public DTAndriod(String masp, String tensp, double boNhoTrong, double giaNhap, double giaBan, String hangSX, double boNhoRam, boolean isNhapKhau) {
        this.setMasp(masp);
        this.setTensp(tensp);
        this.setBoNhoTrong(boNhoTrong);
        this.setGiaNhap(giaNhap);
        this.setGiaBan(giaBan);
        this.hangSX = hangSX;
        this.boNhoRam = boNhoRam;
        this.setNhapKhauInfo(isNhapKhau);

    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getBoNhoRam() {
        return boNhoRam;
    }

    public void setBoNhoRam(double boNhoRam) {
        this.boNhoRam = boNhoRam;
    }

}
