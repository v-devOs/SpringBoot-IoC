package com.example.SpringBootIoC.repository;

import org.springframework.stereotype.Repository;

// @Component("productXMLRepository")
@Repository("productXMLRepository")
public class ProductRepositoryB implements ProductRepository {

  public ProductRepositoryB() {
    System.out.println("Creando intancia de: " + this.getClass().getSimpleName());
  }

  public void save(String name){
    System.out.println(" == SAVE " + this.getClass().getSimpleName() +" ==");
    System.out.println("Producto guardado exitosamente: " + name);
  }

  public void remove( String name ) {
    System.out.println(" == REMOVE " + this.getClass().getSimpleName() +" ==");
    System.out.println("Producto eliminado exitosamente: " + name);

  }
  
}
