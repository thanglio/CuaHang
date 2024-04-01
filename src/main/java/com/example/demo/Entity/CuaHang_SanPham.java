package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "cuahang_sanpham")
public class CuaHang_SanPham extends BaseEntity{

    @ManyToOne
    @JoinColumn(name="cuahang_id")
    private CuaHang cuaHang;

    @ManyToOne
    @JoinColumn(name = "sanpham_id")
    private SanPham sanPham;

    @Column(name = "so_luong")
    private int soLuong;

    public CuaHang_SanPham(CuaHang cuaHang, SanPham sanPham, int soLuong) {
        this.cuaHang = cuaHang;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public CuaHang_SanPham() {
    }

    public CuaHang getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang cuaHang) {
        this.cuaHang = cuaHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
