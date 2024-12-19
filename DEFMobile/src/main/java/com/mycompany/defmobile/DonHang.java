/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */

/*
Đơn hàng có các thông tin:
mã đơn hàng, ngày bán, thông tin khách hàng, thông tin sản phẩm bán ra.

 */
public class DonHang {

    private static final double KHUYEN_MAI_MUC_1 = 0.05;
    private static final double KHUYEN_MAI_MUC_2 = 0.1;

    private String madon;
    private Date ngayBan;
    private KhachHang khachHang;
    private List<DTDD> dsSanPham;

    public DonHang() {
    }

    ;

    // Parameterized Constructor
    public DonHang(String madon, Date ngayBan, KhachHang khachHang, List<DTDD> dsSanPham) throws DTException {
        this.setMadon(madon);
        this.setNgayBan(ngayBan);
        this.setKhachHang(khachHang);
        this.setDsSanPham(dsSanPham);
    }

    // Copy Constructor
    public DonHang(DonHang other) throws DTException {
        this(other.madon, other.ngayBan, other.khachHang, other.dsSanPham);
    }

    // Getters and Setters with Validation
    public String getMadon() {
        return madon;
    }

    public void setMadon(String madon) throws DTException {
        if (madon == null || madon.trim().isEmpty()) {
            throw new DTException("Ma don khong duoc rong hoac null");
        }
        this.madon = madon;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) throws DTException {
        if (ngayBan == null) {
            throw new DTException("Ngay ban khong duoc null");
        }
        this.ngayBan = ngayBan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) throws DTException {
        if (khachHang == null) {
            throw new DTException("Khach hang khong duoc null");
        }
        this.khachHang = khachHang;
    }

    public List<DTDD> getDsSanPham() {
        return dsSanPham;
    }

    public void setDsSanPham(List<DTDD> dsSanPham) throws DTException {
        if (dsSanPham == null || dsSanPham.isEmpty()) {
            throw new DTException("Danh sach san pham khong duoc rong");
        }
        for (DTDD sp : dsSanPham) {
            if (sp == null) {
                throw new DTException("San pham trong danh sach khong duoc null");
            }
        }
        this.dsSanPham = dsSanPham;
    }

    public double tinhKhuyenMai() {
        double tongKhuyenMai = 0;
        int soSanPham = DonHang.demSPTrongThangHienTai(khachHang);

        for (DTDD sanPham : dsSanPham) {

            soSanPham++;

            if (soSanPham == 2) {
                tongKhuyenMai += sanPham.getGiaBan() * DonHang.KHUYEN_MAI_MUC_1;
            } else if (soSanPham >= 3) {
                tongKhuyenMai += sanPham.getGiaBan() * DonHang.KHUYEN_MAI_MUC_2;
            }
        }

        return tongKhuyenMai;
    }

    // Calculate the total amount for the order after applying the discount
    public double tinhThanhTien() {
        double tongTien = 0;
        for (DTDD sanPham : dsSanPham) {
            tongTien += sanPham.getGiaBan() + sanPham.tinhThueVAT();
        }

        return tongTien - this.tinhKhuyenMai();
    }

    public static int demSPTrongThangHienTai(KhachHang khach) {
        Calendar hienTai = Calendar.getInstance();
        int thangHienTai = hienTai.get(Calendar.MONTH);
        int namHienTai = hienTai.get(Calendar.YEAR);

        int soSanPham = 0;

        for (DonHang donHang : khach.getDsDonHang()) {
            Calendar ngayMua = Calendar.getInstance();
            ngayMua.setTime(donHang.getNgayBan());

            if (ngayMua.get(Calendar.MONTH) == thangHienTai
                    && ngayMua.get(Calendar.YEAR) == namHienTai) {
                soSanPham += donHang.getDsSanPham().size();
            }
        }

        return soSanPham;
    }
}
