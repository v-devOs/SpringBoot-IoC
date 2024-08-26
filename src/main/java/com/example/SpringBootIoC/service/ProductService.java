package com.example.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootIoC.repository.ProductRepository;

// @Component
@Service
public class ProductService {

  public ProductService() {
    System.out.println("Creando intancia de: " + this.getClass().getSimpleName());
  }
  
  @Autowired
  // @Qualifier("productXMLRepository")
  private ProductRepository productRepository;

  public void save( String name ) {
    productRepository.save(name);  
  }

  public void remove( String name ) {
    productRepository.save(name);
  }

}
