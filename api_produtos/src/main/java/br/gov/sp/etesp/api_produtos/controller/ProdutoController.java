package br.gov.sp.etesp.api_produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etesp.api_produtos.model.Produto;
import br.gov.sp.etesp.api_produtos.service.ProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	@Autowired
	ProdutoService service;
	
	@PostMapping("/cadastrarproduto")
	public ResponseEntity<?> cadastrarProduto(@RequestBody Produto produto){
		service.cadastrarProduto(produto);
		return ResponseEntity.ok("Produto cadastrado com sucesso.");
	}
}
