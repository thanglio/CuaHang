package com.example.demo.Controller;

import com.example.demo.Service.ImplementService.CuaHangServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cuahang")
public class CuaHangController {
    @Autowired
    CuaHangServiceImplement cuaHangServiceImplement;

    @GetMapping
    public String hien() {
        return "hello";
    }

    @DeleteMapping
    public void deleteCuaHang(Long id) {
        cuaHangServiceImplement.deleteCuaHang(id);
    }
}
