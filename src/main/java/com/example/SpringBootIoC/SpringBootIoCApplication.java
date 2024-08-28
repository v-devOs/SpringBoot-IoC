package com.example.SpringBootIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootIoC.service.ProductService;


@RestController
@SpringBootApplication
public class SpringBootIoCApplication  {

	@Autowired
	private ProductService productService;

	public SpringBootIoCApplication(
	) {
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@GetMapping("/example")
	public String example() {
		productService.save("Zapatos nike");
		return String.format("Hola spring");
	}


}
