package com.example.SpringBootIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.SpringBootIoC.repository.ProductRepositoryA;
import com.example.SpringBootIoC.repository.ProductRepositoryB;
import com.example.SpringBootIoC.service.ProductService;

@Configuration
public class BeansInjector {
  
  @Bean("productMySQLRepository")
  @Primary
  ProductRepositoryA createProductRespositoryA(){
    return new ProductRepositoryA();
  }
  
  @Bean("productXMLRepository")
  ProductRepositoryB creaProductRepositoryB(){
    return new ProductRepositoryB();
  }

  @Bean
  ProductService createProductService(){
    return new ProductService();
  }
}
