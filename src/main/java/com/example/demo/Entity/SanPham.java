package com.example.demo.Entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "sanpham")
public class SanPham extends BaseEntity {


    @Column
    private String tenSanPham;

    @Column
    private int giaNhap;

    @Column
    private int giaBan;

    @Column
    private int giamGia;


    @Column
    private String thongTin;

    @Column
    @DateTimeFormat(pattern = "MM/dd/YYYY ")
    private LocalDateTime ngaySanXuat;

    @Column
    @DateTimeFormat(pattern = "MM/dd/YYYY")
    private LocalDateTime hanSuDung;

    @OneToMany(mappedBy = "sanPham")
    Set<CuaHang_SanPham>  cuaHangSanPhams;

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

    public Set<CuaHang_SanPham> getCuaHangSanPhams() {
        return cuaHangSanPhams;
    }

    public void setCuaHangSanPhams(Set<CuaHang_SanPham> cuaHangSanPhams) {
        this.cuaHangSanPhams = cuaHangSanPhams;
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
