package com.example.SpringBootIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.SpringBootIoC.repository.ProductRepository;

@Configuration
public class BeansInjector {
  
  @Bean
  ProductRepository createProductRespository(){
    return new ProductRepository();
  }
}
