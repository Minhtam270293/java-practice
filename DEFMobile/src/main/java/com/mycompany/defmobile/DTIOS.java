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

    public DTIOS(String masp, String tensp, double boNhoTrong, double giaNhap, double giaBan, String OSVersion) throws DTException {
        super(masp, tensp, boNhoTrong, giaNhap, giaBan);
        this.setOSVersion(OSVersion);
    }

    public String getOSVersion() {
        return this.OSVersion;
    }

    public void setOSVersion(String version) throws DTException {

        if (version == null) {
            throw new DTException("Khong the rong");
        }

        this.OSVersion = version;
    }

}
