package com.example.demo.Service;

import com.example.demo.Entity.DiaChi;

import java.util.List;

public interface DiaChiService {
    public DiaChi add(DiaChi dc);
    public List<DiaChi> del(long id);
    public DiaChi change(long id, DiaChi dc);
}
