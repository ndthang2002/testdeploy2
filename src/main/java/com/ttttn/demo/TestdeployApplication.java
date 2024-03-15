package com.ttttn.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ttttn.demo.entity.NhanVien;
import com.ttttn.demo.service.NhanVienService;

@SpringBootApplication
public class TestdeployApplication {
 

	public static void main(String[] args) {
	  
		SpringApplication.run(TestdeployApplication.class, args);
		
	}

}
