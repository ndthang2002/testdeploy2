package com.ttttn.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ttttn.demo.entity.NhanVien;


public interface NhanVienService {

   List<NhanVien> findAll();
}
    