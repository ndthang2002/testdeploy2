package com.ttttn.demo.serviceIMPL;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttttn.demo.JpaRepository.NhanVienJpa;
import com.ttttn.demo.entity.NhanVien;
import com.ttttn.demo.service.NhanVienService;
@Service
public class NhanVienIMPL implements NhanVienService{

  @Autowired
  NhanVienJpa nhanvien;

  @Override
  public List<NhanVien> findAll() {
    // TODO Auto-generated method stub
    return nhanvien.findAll();
  }
  
}
