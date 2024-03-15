package com.ttttn.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ttttn.demo.JpaRepository.NhanVienJpa;
import com.ttttn.demo.entity.NhanVien;
import com.ttttn.demo.service.NhanVienService;

@RestController
public class NhanVienController {

 @Autowired
  NhanVienService nhanVienService;
  
  @GetMapping("/test")
  public @ResponseBody Iterable<NhanVien> findAll(){
    return nhanVienService.findAll();
  }
}
