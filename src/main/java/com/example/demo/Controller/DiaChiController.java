package com.example.demo.Controller;

import com.example.demo.Entity.DiaChi;
import com.example.demo.Service.ImplementService.DiaChiServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/diachi")
public class DiaChiController {
    @Autowired
    DiaChiServiceImplement diaChiServiceImplement;

    @GetMapping()
    public List<DiaChi> LayTatCaDC(){
        return diaChiServiceImplement.getall();
    }

    @PostMapping()
    public DiaChi ThemDiaChi(@RequestBody DiaChi diaChi){
        return diaChiServiceImplement.add(diaChi);
    }
    @PutMapping()
    public DiaChi SuaDiaChi(@RequestParam long id,@RequestBody DiaChi diaChi){
        return diaChiServiceImplement.change(id,diaChi);
    }
    @DeleteMapping()
    public List<DiaChi> XoaDiaChi(@RequestParam long id){
        return diaChiServiceImplement.del(id);
    }
}
