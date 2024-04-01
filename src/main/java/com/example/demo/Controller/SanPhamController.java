package com.example.demo.Controller;

import com.example.demo.Entity.SanPham;
import com.example.demo.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/sanpham")
public class SanPhamController {
    @Autowired
    SanPhamService sanPhamService;

    @PostMapping("/add")
    public List<SanPham> ThemSanPham(@RequestBody SanPham sanPham){
        return sanPhamService.ThemSanPham(sanPham);
    }

    @GetMapping
    public List<SanPham> HienThiAll(){
        return sanPhamService.GetAll();
    }
    @DeleteMapping("/delete")
    public List<SanPham> Xoa(@RequestParam long id){
        return sanPhamService.XoaSanPham(id);
    }

    @PutMapping("/edit")
    public List<SanPham> Sua(@RequestBody SanPham sanPham){
        return sanPhamService.SuaSanPham(sanPham.getId(),sanPham);
    }
    @PutMapping("/edit/cuahang")
    public List<SanPham> ThemVaoCuaHang(@RequestParam long idsp,@RequestParam long idch,@RequestParam int soluong){
        return sanPhamService.ThemVaoCuaHang(idsp, idch, soluong);
    }

}
