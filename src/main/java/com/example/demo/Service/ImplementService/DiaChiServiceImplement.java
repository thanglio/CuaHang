package com.example.demo.Service.ImplementService;

import com.example.demo.Entity.DiaChi;
import com.example.demo.Repository.DiaChiRepo;
import com.example.demo.Service.DiaChiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class DiaChiServiceImplement implements DiaChiService {
    @Autowired
    DiaChiRepo diaChiRepo;
    @Override
    public DiaChi add(DiaChi dc) {
        dc.setCreatedDate(LocalDateTime.now().toLocalDate());
        diaChiRepo.save(dc);
        return dc;
    }

    @Override
    public List<DiaChi> del(long id) {
        try {
            diaChiRepo.deleteById(id);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return diaChiRepo.findAll();
    }

    @Override
    public DiaChi change(long id, DiaChi dc) {
        DiaChi dcold = diaChiRepo.findById(id).get();
        dcold.setModifiedDate(LocalDateTime.now().toLocalDate());
        dcold.setTinh(dc.getTinh());
        dcold.setHuyen(dc.getXa());
        dcold.setXa(dc.getXa());
        return dcold;
    }
}
