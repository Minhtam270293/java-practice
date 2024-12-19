/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

/**
 *
 * @author NguyenMinhTam
 */
public abstract class DTDD implements ITinhThue {

    private static final double VAT = 0.1;
    private static final double THUE_NHAP_KHAU = 0.1;

    private String masp;
    private String tensp;
    private double boNhoTrong;
    private double giaNhap;
    private double giaBan;

    public DTDD(String masp, String tensp, double boNhoTrong, double giaNhap, double giaBan) throws DTException {
        this.setMasp(masp);
        this.setTensp(tensp);
        this.setBoNhoTrong(boNhoTrong);
        this.setGiaNhap(giaNhap);
        this.setGiaBan(giaBan);
    }

    public DTDD(DTDD other) throws DTException {
        this(other.masp, other.tensp, other.boNhoTrong, other.giaNhap, other.giaBan);
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) throws DTException {
        if (masp == null || masp.trim().isEmpty()) {
            throw new DTException("Ma san pham khong duoc de trong hoac null");
        }
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getBoNhoTrong() {
        return boNhoTrong;
    }

    public void setBoNhoTrong(double boNhoTrong) throws DTException {
        if (boNhoTrong < 0) {
            throw new DTException("Bo nho trong khong duoc am");
        }
        this.boNhoTrong = boNhoTrong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) throws DTException {
        if (giaNhap <= 0) {
            throw new DTException("Gia nhap phai lon hon 0");
        }
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) throws DTException {
        if (giaBan <= 0) {
            throw new DTException("Gia ban phai lon hon 0");
        }
        this.giaBan = giaBan;
    }

    @Override
    public double tinhThueNhapKhau() {
        return this.giaNhap * (1 + DTDD.THUE_NHAP_KHAU);
    }

    @Override
    public double tinhThueVAT() {
        return this.giaBan * DTDD.VAT;
    }
}
