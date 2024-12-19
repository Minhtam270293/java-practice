/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

/**
 *
 * @author PC
 */
public class DTNhapKhau extends DTDD {

    private double thueNhapKhau;
    private String nuocSX;

    public DTNhapKhau(String masp, String tensp, double boNhoTrong, double giaNhap, double giaBan, double thueNhapKhau, String nuocSX) throws DTException {
        super(masp, tensp, boNhoTrong, giaNhap, giaBan);
        this.setThueNhapKhau(thueNhapKhau);
        this.setNuocSX(nuocSX);
    }

    // Copy Constructor
    public DTNhapKhau(DTNhapKhau other) throws DTException {
        this(other.getMasp(), other.getTensp(), other.getBoNhoTrong(), other.getGiaNhap(), other.getGiaBan(), other.thueNhapKhau, other.nuocSX);
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) throws DTException {

        if (nuocSX == null) {
            throw new DTException("Khong duoc rong");
        }

        this.nuocSX = nuocSX;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thue) throws DTException {
        if (thue < 0) {
            throw new DTException("Khong duoc < 0");
        }

        this.thueNhapKhau = thue;
    }
}
