package com.example.demo.Repository;

import com.example.demo.Entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CuaHangRepo extends JpaRepository<CuaHang, Long> {
    @Query(value = "delete from cua_hang where id=?1", nativeQuery = true)
    public void delete(Long id);
}
