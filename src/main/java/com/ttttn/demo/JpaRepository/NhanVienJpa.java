package com.ttttn.demo.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ttttn.demo.entity.NhanVien;


@Repository
public interface NhanVienJpa  extends JpaRepository<NhanVien, Integer>{
  
  
}
