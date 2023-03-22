package com.example.demo.Service;

import com.example.demo.DTO.CuaHangDto;
import com.example.demo.Entity.CuaHang;

public interface CuaHangService {
    void deleteCuaHang(Long id);

    CuaHangDto addCuaHang(CuaHangDto cuaHangDto);
}
