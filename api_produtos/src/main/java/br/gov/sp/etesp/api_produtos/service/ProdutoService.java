package br.gov.sp.etesp.api_produtos.service;

import java.util.List;

import br.gov.sp.etesp.api_produtos.model.Produto;

public interface ProdutoService {
	
	public void cadastrarProduto(Produto produto);
	
	public List<Produto> listar();
	
}
