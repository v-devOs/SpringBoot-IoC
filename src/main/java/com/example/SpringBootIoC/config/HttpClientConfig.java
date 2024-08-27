package com.example.SpringBootIoC.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.SpringBootIoC.repository.ProductRepository;

@Configuration
public class HttpClientConfig {
  
  @Bean
  RestTemplate restTemplate( 
    @Qualifier("productXMLRepository")
    ProductRepository productRepository 
  ) {
    System.out.println("Creando bean de un rest template");
    productRepository.save("T Shirt XL");
    return new RestTemplate();
  }
}
