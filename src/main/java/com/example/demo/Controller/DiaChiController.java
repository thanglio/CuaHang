package com.example.demo.Controller;

import com.example.demo.Entity.DiaChi;
import com.example.demo.Service.ImplementService.DiaChiServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/diachi")
public class DiaChiController {
    @Autowired
    DiaChiServiceImplement diaChiServiceImplement;
    @PostMapping("add")
    public DiaChi ThemDiaChi(@RequestBody DiaChi diaChi){
        return diaChiServiceImplement.add(diaChi);
    }
    @PutMapping("change")
    public DiaChi SuaDiaChi(@RequestParam long id,@RequestBody DiaChi diaChi){
        return diaChiServiceImplement.change(id,diaChi);
    }
    @DeleteMapping("delete")
    public List<DiaChi> XoaDiaChi(@RequestParam long id){
        return diaChiServiceImplement.del(id);
    }
}
