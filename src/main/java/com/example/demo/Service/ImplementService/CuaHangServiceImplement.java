package com.example.demo.Service.ImplementService;

import com.example.demo.Repository.CuaHangRepo;
import com.example.demo.Service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuaHangServiceImplement implements CuaHangService {

    @Autowired
    CuaHangRepo cuaHangRepo;
    @Override
    public void deleteCuaHang(Long id) {
        cuaHangRepo.delete(id);
    }
}
