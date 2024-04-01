package com.example.demo.Service.ImplementService;

import com.example.demo.Entity.CuaHang;
import com.example.demo.Entity.CuaHang_SanPham;
import com.example.demo.Entity.SanPham;
import com.example.demo.Repository.CuaHangRepo;
import com.example.demo.Repository.CuaHang_SanPhamRepo;
import com.example.demo.Repository.SanPhamRepo;
import com.example.demo.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class SanPhamServiceImplement implements SanPhamService {
    @Autowired
    SanPhamRepo sanPhamRepo;
    @Autowired
    CuaHang_SanPhamRepo ch_spRepo;
    @Autowired
    CuaHangRepo cuaHangRepo;

    @Override
    public List<SanPham> GetAll() {
        return sanPhamRepo.findAll();
    }

    @Override
    public List<SanPham> ThemSanPham(SanPham sanPham) {
        sanPham.setCreatedDate(LocalDate.now());
        sanPhamRepo.save(sanPham);
        return sanPhamRepo.findAll();
    }

    @Override
    public List<SanPham> SuaSanPham(long id, SanPham sanPham) {
        SanPham spOld=sanPhamRepo.findById(id).get();
        spOld.setTenSanPham(sanPham.getTenSanPham());
        spOld.setGiaNhap(sanPham.getGiaNhap());
        spOld.setGiaBan(sanPham.getGiaBan());
        spOld.setGiamGia(sanPham.getGiamGia());
        spOld.setGiaBan(sanPham.getGiaBan());
        spOld.setThongTin(sanPham.getThongTin());
        spOld.setModifiedDate(LocalDate.now());
        return sanPhamRepo.findAll();
    }

    @Override
    public List<SanPham> XoaSanPham(long id) {
        sanPhamRepo.deleteById(id);
        return sanPhamRepo.findAll();
    }

    @Override
    public List<SanPham> ThemVaoCuaHang(long idSP, long idCH,int soLuong) {
        CuaHang ch=cuaHangRepo.findById(idCH).get();
        SanPham sp=sanPhamRepo.findById(idSP).get();
        CuaHang_SanPham cuaHang_sanPham= new CuaHang_SanPham(ch,sp,soLuong);
        Set<CuaHang_SanPham> ch_sp=ch.getCuaHangSanPhams();
        ch_sp.add(cuaHang_sanPham);
        ch.setCuaHangSanPhams(ch_sp);
        cuaHangRepo.save(ch);
        Set<CuaHang_SanPham> sp_ch=sp.getCuaHangSanPhams();
        sp_ch.add(cuaHang_sanPham);
        sp.setCuaHangSanPhams(sp_ch);
        sanPhamRepo.save(sp);
        ch_spRepo.save(cuaHang_sanPham);
        return sanPhamRepo.findAll();
    }
}
