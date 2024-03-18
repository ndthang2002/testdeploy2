package com.ttttn.demo.entity;
import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name="nhanvien")
public class NhanVien {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id ;
  String ten;
  
  public NhanVien() {
    
  }
}
