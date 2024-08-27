package com.example.SpringBootIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.SpringBootIoC.service.ProductService;

@SpringBootApplication
public class SpringBootIoCApplication  {

	private ProductService productService;

	public SpringBootIoCApplication(
		ProductService productService
	) {
		this.productService = productService;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Bean
	CommandLineRunner commandoUtilizandoAutowired(){
		return args -> {
			productService.save("Teclado RGB");
			productService.remove("Auriculares");
		};
	}

	@Autowired
	public void setProductService( ProductService productService ) {
		this.productService = productService;
	}
}
