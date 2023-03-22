package com.example.demo.Entity;

import
        javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cua_hang")
public class CuaHang extends BaseEntity {


   @Column
    private String tenCuaHang;

    @Column
    private String tenChuCuaHang;

    @Column
    private String soDienThoai;

    @Column
    private String email;

    @Column
    private byte capBac;

    @Column
    private String thongTinCuaHang;

    @Column
    private int idKhachHang;

    //Cua hang n-1 Dia Chi
    @ManyToOne
    @JoinColumn(name = "id_diachi")
    private DiaChi diaChi;

    //Cửa Hàng  1-n Hóa đơn
    @OneToMany(mappedBy = "cuaHangx")
    private Set<HoaDon> hoaDons;

    //Cửa hàng 1-n Sản phẩm
    @OneToMany(mappedBy = "cuaHang")
    private Set<SanPham> sanPhams;

    @OneToMany(mappedBy = "cuaHang")
    private Set<Images> images;

    @ManyToMany(mappedBy = "cuaHangs")
    private Set<LoaiSanPham> loaiSanPhams;

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

    public Set<HoaDon> getHoaDons() {
        return hoaDons;
    }

    public void setHoaDons(Set<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

    public Set<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(Set<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public Set<Images> getImages() {
        return images;
    }

    public void setImages(Set<Images> images) {
        this.images = images;
    }

    public Set<LoaiSanPham> getLoaiSanPhams() {
        return loaiSanPhams;
    }

    public void setLoaiSanPhams(Set<LoaiSanPham> loaiSanPhams) {
        this.loaiSanPhams = loaiSanPhams;
    }
}
