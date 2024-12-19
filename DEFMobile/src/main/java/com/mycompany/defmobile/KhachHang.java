/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

import java.util.List;

/**
 *
 * @author PC
 */

/*
Khách hàng có các thông tin:
số điện thoại, họ tên, địa chỉ.
 */
class KhachHang {

    private String sodt;
    private String hoTen;
    private String diaChi;
    private List<DonHang> dsDonHang;

    public KhachHang(String sodt, String hoTen, String diaChi, List<DonHang> dsDonHang) throws DTException {
        this.setSodt(sodt);
        this.setHoTen(hoTen);
        this.setDiaChi(diaChi);
        this.setDsDonHang(dsDonHang);
    }

    // Copy Constructor
    public KhachHang(KhachHang other) throws DTException {
        this(other.sodt, other.hoTen, other.diaChi, other.dsDonHang);
    }

    // Getters and Setters with Validation
    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) throws DTException {
        if (sodt == null || sodt.trim().isEmpty()) {
            throw new DTException("So dien thoai khong duoc rong hoac null");
        }
        this.sodt = sodt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        // Ho ten is optional, no validation needed
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        // Dia chi is optional, no validation needed
        this.diaChi = diaChi;
    }

    public List<DonHang> getDsDonHang() {
        return dsDonHang;
    }

    public void setDsDonHang(List<DonHang> dsDonHang) throws DTException {
        if (dsDonHang == null) {
            throw new DTException("Danh sach don hang khong duoc null");
        }
        for (DonHang dh : dsDonHang) {
            if (dh == null) {
                throw new DTException("Don hang trong danh sach khong duoc null");
            }
        }
        this.dsDonHang = dsDonHang;
    }

    public boolean themDonHang(DonHang donHang) throws DTException {
        if (donHang == null) {
            throw new DTException("Don hang null");
        }

        return this.dsDonHang.add(donHang);
    }
}
