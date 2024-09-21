package br.gov.sp.etesp.api_produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.gov.sp.etesp.api_produtos")
public class ApiProdutosApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiProdutosApplication.class, args); 
	}
  
}
