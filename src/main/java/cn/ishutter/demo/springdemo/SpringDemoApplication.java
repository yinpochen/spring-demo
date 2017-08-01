package cn.ishutter.demo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class SpringDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	@GetMapping("/hi")
	public String hello(@RequestParam String name){
		return "Hello + " + name;
	}
}
