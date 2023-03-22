package com.example.demo.Converter;

import com.example.demo.DTO.CuaHangDto;
import com.example.demo.DTO.KhachHangDto;
import com.example.demo.Entity.CuaHang;
import com.example.demo.Entity.KhachHang;
import org.springframework.stereotype.Component;

@Component
public class CuaHangConverter {

    public CuaHangDto toDto(CuaHang cuaHang) {
        CuaHangDto cuaHangDto = new CuaHangDto();
        if (cuaHang.getId() != null)
            cuaHangDto.setId(cuaHang.getId());
        cuaHangDto.setTenCuaHang(cuaHang.getTenCuaHang());
        cuaHangDto.setTenChuCuaHang(cuaHang.getTenChuCuaHang());
        cuaHangDto.setCapBac(cuaHang.getCapBac());
        cuaHangDto.setDiaChi(cuaHang.getDiaChi());
        cuaHangDto.setEmail(cuaHang.getEmail());
        cuaHangDto.setSoDienThoai(cuaHang.getSoDienThoai());
        cuaHangDto.setThongTinCuaHang(cuaHang.getThongTinCuaHang());
        cuaHangDto.setIdKhachHang(cuaHang.getIdKhachHang());

        cuaHangDto.setCreatedDate(cuaHang.getCreatedDate());
        cuaHangDto.setCreatedBy(cuaHang.getCreatedBy());
        cuaHangDto.setModifiedDate(cuaHang.getModifiedDate());
        cuaHangDto.setModifiedBy(cuaHang.getModifiedBy());
        return cuaHangDto;
    }

    public CuaHang toCuaHang(CuaHangDto cuaHangDto) {
        CuaHang cuaHang = new CuaHang();
        cuaHang.setTenCuaHang(cuaHangDto.getTenCuaHang());
        cuaHang.setTenChuCuaHang(cuaHangDto.getTenChuCuaHang());
        cuaHang.setCapBac(cuaHangDto.getCapBac());
        cuaHang.setDiaChi(cuaHangDto.getDiaChi());
        cuaHang.setEmail(cuaHangDto.getEmail());
        cuaHang.setSoDienThoai(cuaHangDto.getSoDienThoai());
        cuaHang.setThongTinCuaHang(cuaHangDto.getThongTinCuaHang());
        cuaHang.setIdKhachHang(cuaHangDto.getIdKhachHang());
        return cuaHang;
    }

    public CuaHang toCuaHang(CuaHangDto cuaHangDto, CuaHang cuaHang) {
        cuaHang.setTenCuaHang(cuaHangDto.getTenCuaHang());
        cuaHang.setTenChuCuaHang(cuaHangDto.getTenChuCuaHang());
        cuaHang.setCapBac(cuaHangDto.getCapBac());
        cuaHang.setDiaChi(cuaHangDto.getDiaChi());
        cuaHang.setEmail(cuaHangDto.getEmail());
        cuaHang.setSoDienThoai(cuaHangDto.getSoDienThoai());
        cuaHang.setThongTinCuaHang(cuaHangDto.getThongTinCuaHang());
        cuaHang.setIdKhachHang(cuaHangDto.getIdKhachHang());
        return cuaHang;
    }
}
