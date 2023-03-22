package com.example.demo.Service.ImplementService;

import com.example.demo.Converter.CuaHangConverter;
import com.example.demo.DTO.CuaHangDto;
import com.example.demo.Entity.CuaHang;
import com.example.demo.Repository.CuaHangRepo;
import com.example.demo.Service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuaHangServiceImplement implements CuaHangService {

    @Autowired
    CuaHangRepo cuaHangRepo;
    @Autowired
    CuaHangConverter cuaHangConverter;

    @Override
    public void deleteCuaHang(Long id) {
        cuaHangRepo.delete(id);
    }

    @Override
    public CuaHangDto addCuaHang(CuaHangDto cuaHangDto) {
        CuaHang cuaHang = new CuaHang();
        cuaHang = cuaHangConverter.toCuaHang(cuaHangDto);
        cuaHangRepo.save(cuaHang);
        return cuaHangDto;
    }
}
