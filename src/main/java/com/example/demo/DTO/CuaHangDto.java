package com.example.demo.DTO;

import com.example.demo.Entity.*;


public class CuaHangDto extends AbstractDto {

    private String tenCuaHang;


    private String tenChuCuaHang;


    private String soDienThoai;


    private String email;


    private byte capBac;


    private String thongTinCuaHang;


    private int idKhachHang;


    private DiaChi diaChi;

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
    }

    public String getTenChuCuaHang() {
        return tenChuCuaHang;
    }

    public void setTenChuCuaHang(String tenChuCuaHang) {
        this.tenChuCuaHang = tenChuCuaHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getCapBac() {
        return capBac;
    }

    public void setCapBac(byte capBac) {
        this.capBac = capBac;
    }

    public String getThongTinCuaHang() {
        return thongTinCuaHang;
    }

    public void setThongTinCuaHang(String thongTinCuaHang) {
        this.thongTinCuaHang = thongTinCuaHang;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }
}
