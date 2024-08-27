package com.example.SpringBootIoC.repository;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @Component("productXMLRepository")
@Repository("productXMLRepository")
public class ProductRepositoryB implements ProductRepository {

  @PostConstruct
  public void postContruct() {
    System.out.println("====> Creando intancia de: " + this.getClass().getSimpleName());

  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("====> Borrando intancia de: " + this.getClass().getSimpleName());
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
