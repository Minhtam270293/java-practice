/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.defmobile;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class TestCuaHang {

    public static void main(String[] args) throws DTException {

        KhachHang invoker = new KhachHang("0123456789", "Invoker", "Radiant Base", new ArrayList<>());
        KhachHang pudge = new KhachHang("0987654321", "Pudge", "Dire Jungle", new ArrayList<>());
        KhachHang jugg = new KhachHang("0111222333", "Juggernaut", "Top Lane", new ArrayList<>());
        KhachHang phantom = new KhachHang("0999888777", "Phantom Assassin", "Safe Lane", new ArrayList<>());
        KhachHang rylai = new KhachHang("0444555666", "Crystal Maiden", "Mid Lane", new ArrayList<>());

        DTIOS ios1 = new DTIOS("IOS001", "iPhone 14 Pro", 128.0, 800.0, 30000000.0, "iOS 16");
        DTIOS ios2 = new DTIOS("IOS002", "iPhone 13 Mini", 64.0, 600.0, 24000000.0, "iOS 15");

        DTAndriod android1 = new DTAndriod("AND001", "Samsung Galaxy S21", 256.0, 700.0, 22000000, "Samsung", 8.0);
        DTAndriod android2 = new DTAndriod("AND002", "Google Pixel 6", 128.0, 650.0, 18000000, "Google", 6.0);

        DTNhapKhau nk1 = new DTNhapKhau("NK001", "Huawei P50", 256.0, 700.0, 17000000, 0.1, "China");
        DTNhapKhau nk2 = new DTNhapKhau("NK002", "Xiaomi Mi 11", 128.0, 500.0, 14000000, 0.08, "China");

        CuaHang DEFMobile = new CuaHang();
        DEFMobile.setDsSanPham(new ArrayList<>()); // Initialize product list
        DEFMobile.setDsKhachHang(new ArrayList<>()); // Initialize customer list
        DEFMobile.setDsDonHang(new ArrayList<>()); // Initialize order list
        DEFMobile.addSanPham(ios1);
        DEFMobile.addSanPham(ios2);
        DEFMobile.addSanPham(android1);
        DEFMobile.addSanPham(android2);
        DEFMobile.addSanPham(nk1);
        DEFMobile.addSanPham(nk2);

        List<DTDD> iosPhones = new ArrayList<>();
        iosPhones.add(ios1);
        iosPhones.add(ios2);

        List<DTDD> androidPhones = new ArrayList<>();
        androidPhones.add(android1);
        androidPhones.add(android2);

        List<DTDD> importedPhones = new ArrayList<>();
        importedPhones.add(nk1);
        importedPhones.add(nk2);

        // Create a combined list of all phone types
        List<DTDD> allPhones = new ArrayList<>();
        allPhones.add(ios1);
        allPhones.add(ios2);
        allPhones.add(android1);
        allPhones.add(android2);
        allPhones.add(nk1);
        allPhones.add(nk2);

        DEFMobile.banHang(phantom, allPhones);
        DEFMobile.banHang(phantom, iosPhones);
        DEFMobile.banHang(phantom, iosPhones);
        DEFMobile.banHang(phantom, iosPhones);
        DEFMobile.banHang(phantom, iosPhones);
        DEFMobile.banHang(phantom, iosPhones);
        DEFMobile.banHang(jugg, allPhones);
        DEFMobile.banHang(invoker, iosPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(rylai, importedPhones);
        DEFMobile.banHang(pudge, androidPhones);

        // Test timKhachMuaNhieuSPNhat
        System.out.println("\n=== Customers with the Most Products Purchased ===");
        List<KhachHang> mostPurchasingCustomers = DEFMobile.timKhachMuaNhieuSPNhat();
        for (KhachHang kh : mostPurchasingCustomers) {
            int totalProducts = kh.getDsDonHang().stream()
                    .mapToInt(dh -> dh.getDsSanPham().size()) // Count products in each order
                    .sum();
            System.out.println("Customer: " + kh.getHoTen() + " - Total Products: " + totalProducts);
        }

        // Test timKhachMuaGiaTriCaoNhatCuaNam
        System.out.println("\n=== Customers with the Highest Purchase Value in 2024 ===");
        List<KhachHang> highestValueCustomers = DEFMobile.timKhachMuaGiaTriCaoNhatCuaNam(2024);
        for (KhachHang kh : highestValueCustomers) {
            System.out.println("Customer: " + kh.getHoTen());
        }

        // Test dsDTSLBanNhieuNhat
        System.out.println("\n=== Most Sold Products ===");
        List<String> mostSoldProducts = DEFMobile.dsDTSLBanNhieuNhat();
        for (String product : mostSoldProducts) {
            System.out.println("Product: " + product);
        }

        // Test dsDTBanGiaTriCaoNhat
        System.out.println("\n=== Products with the Highest Sales Value in 2024 ===");
        List<String> highestValueProducts = DEFMobile.dsDTBanGiaTriCaoNhat(2024);
        for (String product : highestValueProducts) {
            System.out.println("Product: " + product);
        }

    }
}
