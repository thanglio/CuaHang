package com.example.demo.Entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sanpham")
public class SanPham extends BaseEntity {


    @Column
    private String tenSanPham;

    @Column
    private int soLuong;

    @Column
    private int giaNhap;

    @Column
    private int giaBan;

    @Column
    private int giamGia;

    @Column
    private int idNguon;

    @Column
    private String thongTin;

    @Column
    @DateTimeFormat(pattern = "MM/dd/YYYY ")
    private LocalDateTime ngaySanXuat;

    @Column
    @DateTimeFormat(pattern = "MM/dd/YYYY")
    private LocalDateTime hanSuDung;

    @ManyToOne
    @JoinColumn(name = "id_cua_hang")
    private CuaHang cuaHang;

    @OneToMany(mappedBy = "sanPham")
    private Set<Images> imagesSet;

    @ManyToOne
    @JoinColumn(name = "id_loai_san_pham")
    private LoaiSanPham loaiSanPham;

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public int getIdNguon() {
        return idNguon;
    }

    public void setIdNguon(int idNguon) {
        this.idNguon = idNguon;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public LocalDateTime getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDateTime ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDateTime getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(LocalDateTime hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public CuaHang getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang cuaHang) {
        this.cuaHang = cuaHang;
    }

    public Set<Images> getImagesSet() {
        return imagesSet;
    }

    public void setImagesSet(Set<Images> imagesSet) {
        this.imagesSet = imagesSet;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }
}
