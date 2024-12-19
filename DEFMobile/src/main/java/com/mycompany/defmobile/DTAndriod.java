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

    public DTAndriod(String masp, String tensp, double boNhoTrong, double giaNhap, double giaBan, String hangSX, double boNhoRam) throws DTException {
        super(masp, tensp, boNhoTrong, giaNhap, giaBan);
        this.setHangSX(hangSX);
        this.setBoNhoRam(boNhoRam);
    }

    public DTAndriod(DTAndriod other) throws DTException {
        this(other.getMasp(), other.getTensp(), other.getBoNhoTrong(), other.getGiaNhap(), other.getGiaBan(), other.hangSX, other.boNhoRam);
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) throws DTException {

        if (hangSX == null) {
            throw new DTException("Ten hang khong duoc rong");
        }

        this.hangSX = hangSX;
    }

    public double getBoNhoRam() {
        return boNhoRam;
    }

    public void setBoNhoRam(double boNhoRam) throws DTException {

        if (boNhoRam <= 0) {
            throw new DTException("Ram khong duoc <= 0");
        }

        this.boNhoRam = boNhoRam;
    }

}
