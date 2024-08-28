package com.example.SpringBootIoC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootIoC.service.ProductService;
import com.example.SpringBootIoC.service.ShoppingCarService;



@RestController
@SpringBootApplication
public class SpringBootIoCApplication  {

	@Autowired
	private ProductService productService;

	@Autowired
	ShoppingCarService shoppingCarService;

	public SpringBootIoCApplication() {}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@GetMapping("/example")
	public String example() {
		productService.save("Zapatos nike");
		return String.format("Hola spring");
	}

	@GetMapping("/add-product")
	public String addProduct() {
		shoppingCarService.add();
		return "Producto agregado";
	}

	@GetMapping("/get-products")
	public List<String> getMethodName() {
		return shoppingCarService.get();
	}
}
