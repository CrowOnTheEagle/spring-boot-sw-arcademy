package com.arcademy.spring_boot_sw_arcademy;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
public class SpringBootSwArcademyApplication {
	@GetMapping("/")
	public String MainPage() {
		return "Spring02:20250811-142716\n";
	}
	public static void main(String[] args) {
		System.out.println("SPRING STARTED!!!");
		SpringApplication.run(SpringBootSwArcademyApplication.class, args);
	}
}