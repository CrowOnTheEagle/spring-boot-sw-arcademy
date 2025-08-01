package com.arcademy.spring_boot_sw_arcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// 웹 브라우저에 리턴된 문자열을 출력
// Print any of the returned string into the web browser
@RestController
public class SpringBootSwArcademyApplication {
	// @GetMapping에서 지정한 경로에 접근 시 함수 호출함
	// The function will be called when the user access specific URL/path
	// defined by the @GetMapping annotation.
	@GetMapping("/")
	public String PrintMain() {
		return "이 페이지는 메인 홈페이지 입니다.\nThis page is Main page";
	}

	@GetMapping("/apple")
	public String Hello() {
		return "BIG DATA\n빅데이터\n";
	}

	public static void main(String[] args) {
		System.out.println("SPRING STARTED!!!");
		SpringApplication.run(SpringBootSwArcademyApplication.class, args);
	}
}