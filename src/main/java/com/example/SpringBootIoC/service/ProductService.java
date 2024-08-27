package com.example.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.SpringBootIoC.repository.ProductRepository;

// @Component
@Service
public class ProductService {

  private ProductRepository productRepository;

  public ProductService( 
  ) {
    System.out.println("Creando intancia de: " + this.getClass().getSimpleName());
  }
  


  public void save( String name ) {
    productRepository.save(name);  
  }

  public void remove( String name ) {
    productRepository.save(name);
  }

  @Autowired
  @Qualifier("productXMLRepository")
  public void setProductRepository( 
    ProductRepository productRepository 
  ) {
    this.productRepository = productRepository;
  }

}
