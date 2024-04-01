package com.example.demo.Service;

import com.example.demo.Entity.SanPham;

import java.util.List;

public interface SanPhamService {
    public List<SanPham> GetAll();
    public List<SanPham> ThemSanPham(SanPham sanPham);
    public List<SanPham> SuaSanPham(long id,SanPham sanPham);
    public List<SanPham> XoaSanPham(long id);
    public List<SanPham> ThemVaoCuaHang(long idSP, long idCH,int soLuong);

}
