package com.example.demo.Repository;

import com.example.demo.Entity.CuaHang_SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuaHang_SanPhamRepo extends JpaRepository<CuaHang_SanPham,Long> {
}
