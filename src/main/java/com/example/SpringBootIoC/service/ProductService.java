package com.example.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SpringBootIoC.repository.ProductRepositoryA;

public class ProductService {

  public ProductService() {
    System.out.println("Creando intancia de: " + this.getClass().getSimpleName());
  }
  
  @Autowired
  private ProductRepositoryA productRepositoryA;

  public void save( String name ) {
    productRepositoryA.save(name);  
  }

  public void remove( String name ) {
    productRepositoryA.save(name);
  }

}
