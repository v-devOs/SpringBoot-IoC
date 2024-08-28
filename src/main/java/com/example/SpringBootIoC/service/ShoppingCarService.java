package com.example.SpringBootIoC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@SessionScope
public class ShoppingCarService {
  private List<String> products = new ArrayList<>();

  private Integer counter = 0;

  public void add () {
    counter++;
    products.add(counter.toString() + " - Micronfono");
  }

  public List<String> get() {
    return products;
  }

  @PostConstruct
  public void postContruct() {
    System.out.println("====> Creando intancia de: " + this.getClass().getSimpleName());

  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("====> Borrando intancia de: " + this.getClass().getSimpleName());
  }
}
