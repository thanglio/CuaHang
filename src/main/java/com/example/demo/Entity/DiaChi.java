package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dia_chi")
public class DiaChi extends BaseEntity {

    @Column
    private String tinh;

    @Column
    private String huyen;

    @Column
    private String xa;

    @OneToMany(mappedBy = "diaChi")
    private Set<CuaHang> cuaHangs;

    @OneToMany(mappedBy = "diaChi")
    private Set<KhachHang> khachHangs;

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public Set<CuaHang> getCuaHangs() {
        return cuaHangs;
    }

    public void setCuaHangs(Set<CuaHang> cuaHangs) {
        this.cuaHangs = cuaHangs;
    }

    public Set<KhachHang> getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(Set<KhachHang> khachHangs) {
        this.khachHangs = khachHangs;
    }
}

