package com.example.demo.Service;

import com.example.demo.Entity.SanPham;

import java.util.List;

public interface SanPhamService {
    public SanPham ThemSanPham(SanPham sanPham);
    public  SanPham SuaSanPham(long id,SanPham sanPham);
    public  String XoaSanPham(long id);
    public List<SanPham> ThemVaoCuaHang(long idSP, long idCH);

}
