package com.arcademy.spring_boot_sw_arcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSwArcademyApplication {
	// 시작 페이지 진입 시 이 함수 호출
	// This function will be called when the user enters the start page
	@GetMapping("/")
	public String Hello() {
		return "NOTHING HERE\n";
	}

	public static void main(String[] args) {
		System.out.println("SPRING STARTED!!!");
		SpringApplication.run(SpringBootSwArcademyApplication.class, args);
	}

}
