/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

/**
 *
 * @author NguyenMinhTam
 */

/*
Điện thoại Android có các thuộc tính:
mã sản phẩm, tên sản phẩm, ..hãng sản xuất, ..dung lượng RAM, dung lượng bộ nhớ trong, giá nhập, giá bán.
Điện thoại iOS có các thuộc tính:
mã sản phẩm, tên sản phẩm, ..phiên bản hệ điều hành, dung lượng bộ nhớ trong, giá nhập, giá bán.
 */
public abstract class DTDD {

    private String masp;
    private String tensp;
    private double boNhoTrong;
    private double giaNhap;
    private double giaBan;
    private boolean isNhapKhau;
    private double thueNhapKhau;
    private String nuocSX;

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
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

    public void setBoNhoTrong(double boNhoTrong) {
        this.boNhoTrong = boNhoTrong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public boolean getNhapKhauInfo() {
        return isNhapKhau;
    }

    public void setNhapKhauInfo(boolean isNhapKhau) {
        this.isNhapKhau = isNhapKhau;
        if (!isNhapKhau) {
            this.nuocSX = "Domestic";
            this.thueNhapKhau = 0;
        }
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) throws DTException {
        if (!this.isNhapKhau) {
            throw new DTException("Khong thuc hien duoc voi dien thoai trong nuoc");
        }

        this.nuocSX = nuocSX;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thue) throws DTException {
        if (!this.isNhapKhau) {
            throw new DTException("Khong thuc hien duoc voi dien thoai trong nuoc");
        }

        this.thueNhapKhau = thue;
    }
}
