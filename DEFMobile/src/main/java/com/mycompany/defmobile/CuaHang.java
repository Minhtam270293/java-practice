/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PC
 */
public class CuaHang {

    private List<DTDD> dsSanPham;
    private List<KhachHang> dsKhachHang;
    private List<DonHang> dsDonHang;

    // Getter and Setter for dsSanPham
    public List<DTDD> getDsSanPham() {
        return dsSanPham;
    }

    public void setDsSanPham(List<DTDD> dsSanPham) {
        this.dsSanPham = dsSanPham;
    }

// Getter and Setter for dsKhachHang
    public List<KhachHang> getDsKhachHang() {
        return dsKhachHang;
    }

    public void setDsKhachHang(List<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

// Getter and Setter for dsDonHang
    public List<DonHang> getDsDonHang() {
        return dsDonHang;
    }

    public void setDsDonHang(List<DonHang> dsDonHang) {
        this.dsDonHang = dsDonHang;
    }

    public void addKhachHang(KhachHang khachHang) {
        if (khachHang != null && !dsKhachHang.contains(khachHang)) {
            dsKhachHang.add(khachHang);
        }
    }

    // Add a new DonHang to the list
    public void addDonHang(DonHang donHang) {
        if (donHang != null && !dsDonHang.contains(donHang)) {
            dsDonHang.add(donHang);
        }
    }

    // Add a new DTDD to the list
    public void addSanPham(DTDD sanPham) {
        if (sanPham != null && !dsSanPham.contains(sanPham)) {
            dsSanPham.add(sanPham);
        }
    }

    public List<KhachHang> timKhachMuaNhieuSPNhat() {

        if (dsKhachHang == null || dsKhachHang.isEmpty()) {
            return new ArrayList<>();
        }

        // Create a map of KhachHang: soLuongSP
        List<KhachHang> khachHangMuaSLNhieuNhat = new ArrayList<>();

        Map<KhachHang, Integer> dsKhachVaSP = new HashMap<>();
        // Calculate total products for each customer
        for (KhachHang khach : dsKhachHang) {
            int soLuongSP = 0;

            // Ensure the list of orders is not null
            if (khach.getDsDonHang() != null) {
                for (DonHang donHang : khach.getDsDonHang()) {
                    // Ensure the list of products is not null
                    if (donHang.getDsSanPham() != null) {
                        soLuongSP += donHang.getDsSanPham().size();
                    }
                }
            }

            dsKhachVaSP.put(khach, soLuongSP);
        }

        // Find Khachs with max soLuongSP
        int max = 0;
        for (Map.Entry<KhachHang, Integer> entry : dsKhachVaSP.entrySet()) {

            Integer soLuong = entry.getValue();

            if (soLuong > max) {
                max = soLuong;
            }
        }

        for (Map.Entry<KhachHang, Integer> entry : dsKhachVaSP.entrySet()) {
            KhachHang khach = entry.getKey();
            Integer soLuong = entry.getValue();

            if (soLuong == max) {
                khachHangMuaSLNhieuNhat.add(khach);
            }
        }

        return khachHangMuaSLNhieuNhat;
    }

    private int getYearFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    public List<KhachHang> timKhachMuaGiaTriCaoNhatCuaNam(int nam) {

        Map<KhachHang, Double> dsKhachVaGiaTri = new HashMap();
        List<KhachHang> khachMuaGiaTriCaoNhat = new ArrayList<>();

        for (KhachHang khach : dsKhachHang) {

            double giaTri = 0;

            for (DonHang dh : khach.getDsDonHang()) {

                if (this.getYearFromDate(dh.getNgayBan()) == nam) {
                    giaTri += dh.tinhThanhTien();
                }
            }

            dsKhachVaGiaTri.put(khach, giaTri);
        }

        double max = 0;
        for (Map.Entry<KhachHang, Double> entry : dsKhachVaGiaTri.entrySet()) {
            double giaTri = entry.getValue();

            if (giaTri > max) {
                max = giaTri;
            }
        }

        for (Map.Entry<KhachHang, Double> entry : dsKhachVaGiaTri.entrySet()) {
            double giaTri = entry.getValue();
            KhachHang khach = entry.getKey();

            if (giaTri == max) {
                khachMuaGiaTriCaoNhat.add(khach);
            }
        }

        return khachMuaGiaTriCaoNhat;
    }

    public List<String> dsDTSLBanNhieuNhat() {
        List<String> dsDTBanNhieuNhat = new ArrayList<>();

        Map<String, Integer> dsTenSPVaSoLuong = new HashMap();

        for (DonHang dh : dsDonHang) {
            for (DTDD sanPham : dh.getDsSanPham()) {
                String tenSP = sanPham.getTensp();
                dsTenSPVaSoLuong.put(tenSP, dsTenSPVaSoLuong.getOrDefault(tenSP, 0) + 1);
            }
        }

        int max = 0;

        for (Map.Entry<String, Integer> entry : dsTenSPVaSoLuong.entrySet()) {
            int soLuong = entry.getValue();
            if (soLuong > max) {
                max = soLuong;
            }
        }

        for (Map.Entry<String, Integer> entry : dsTenSPVaSoLuong.entrySet()) {
            int soLuong = entry.getValue();
            String tenSP = entry.getKey();
            if (soLuong == max) {
                dsDTBanNhieuNhat.add(tenSP);
            }
        }

        return dsDTBanNhieuNhat;

    }

    public List<String> dsDTBanGiaTriCaoNhat(int nam) {
        List<String> dsDTBanGiaTriNhat = new ArrayList<>();

        Map<String, Double> dsTenSPVaGiaTri = new HashMap();

        for (DonHang dh : dsDonHang) {

            if (this.getYearFromDate(dh.getNgayBan()) != nam) {
                continue;
            }

            for (DTDD sanPham : dh.getDsSanPham()) {

                String tenSP = sanPham.getTensp();
                double giaBan = sanPham.getGiaBan();

                dsTenSPVaGiaTri.put(tenSP, dsTenSPVaGiaTri.getOrDefault(tenSP, 0.0) + giaBan);
            }
        }

        double max = 0;

        for (Map.Entry<String, Double> entry : dsTenSPVaGiaTri.entrySet()) {
            double giaTri = entry.getValue();
            if (giaTri > max) {
                max = giaTri;
            }
        }

        for (Map.Entry<String, Double> entry : dsTenSPVaGiaTri.entrySet()) {
            double giaTri = entry.getValue();
            String tenSP = entry.getKey();
            if (giaTri == max) {
                dsDTBanGiaTriNhat.add(tenSP);
            }
        }

        return dsDTBanGiaTriNhat;
    }

    public void banHang(KhachHang khachHang, List<DTDD> dsSanPham) throws DTException {
        if (khachHang == null) {
            throw new DTException("Khách hàng không được null");
        }
        if (dsSanPham == null || dsSanPham.isEmpty()) {
            throw new DTException("Danh sách sản phẩm không được null hoặc rỗng");
        }

        // Kiểm tra khách hàng có tồn tại hay không
        KhachHang existingKhachHang = null;
        for (KhachHang kh : dsKhachHang) {
            if (kh.getSodt().equals(khachHang.getSodt())) {
                existingKhachHang = kh;
                break;
            }
        }

        // Nếu khách hàng không tồn tại, thêm khách hàng vào danh sách
        if (existingKhachHang == null) {
            existingKhachHang = khachHang;
            this.addKhachHang(existingKhachHang);
        }

        // Tạo mới đơn hàng
        DonHang donHang = new DonHang();
        donHang.setMadon("DH" + (dsDonHang.size() + 1)); // Tạo mã đơn hàng duy nhất
        donHang.setNgayBan(new Date()); // Đặt ngày bán hiện tại
        donHang.setDsSanPham(new ArrayList<>(dsSanPham)); // Gán danh sách sản phẩm
        donHang.setKhachHang(existingKhachHang); // Gán khách hàng

        // Cập nhật danh sách đơn hàng của khách hàng
        if (existingKhachHang.getDsDonHang() == null) {
            existingKhachHang.setDsDonHang(new ArrayList<>());
        }
        existingKhachHang.getDsDonHang().add(donHang);

        // Thêm đơn hàng vào danh sách đơn hàng của cửa hàng
        this.addDonHang(donHang);
    }

}
