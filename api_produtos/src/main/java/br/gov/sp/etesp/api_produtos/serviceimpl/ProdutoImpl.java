package br.gov.sp.etesp.api_produtos.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etesp.api_produtos.entity.ProdutoEntity;
import br.gov.sp.etesp.api_produtos.model.Produto;
import br.gov.sp.etesp.api_produtos.repository.ProdutoRepository;
import br.gov.sp.etesp.api_produtos.service.ProdutoService;

@Service
public class ProdutoImpl implements ProdutoService {
	@Autowired
	ProdutoRepository vasco;
	
	@Override
	public void cadastrarProduto(Produto produto) {
		ProdutoEntity flamengo = new ProdutoEntity();
		flamengo.setNomeDoProduto(produto.getNomeDoProduto());
		flamengo.setDescricao(produto.getDescricao());
		flamengo.setPreco(produto.getPreco());
		flamengo.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque());
		vasco.save(flamengo);
	}

	@Override
	public List<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
