package com.example.SpringBootIoC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner  {

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
}
