package com.example.SpringBootIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.SpringBootIoC.repository.ProductRepositoryA;
import com.example.SpringBootIoC.repository.ProductRepositoryB;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner  {

	@Autowired
	private ProductRepositoryA productRepository;
	@Autowired
	private ProductRepositoryB productRepositoryB;



	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola desde la interfaz CommandLineRunner");
	}

	@Bean
	CommandLineRunner comandoGenerico(){
		return args -> {
			System.out.println("Hola desde la interfaz CommandLineRunner implementada con una expresion lambda");
		};
	}

	@Bean
	CommandLineRunner commandoUtilizandoAutowired(){
		return args -> {
			System.out.println("PRODUCT REPOSITORY A");

			productRepository.save("Control remoto");
			productRepository.remove("Mouse USB generico");

			System.out.println("PRODUCT REPOSITORY B");
			productRepositoryB.save("Microfono");
			productRepositoryB.remove("Bocina");
		};
	}
}
