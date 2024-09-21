package br.gov.sp.etesp.api_produtos.model;

public class Produto {
	
	private String nomeDoProduto;
	private String descricao;
	private Double preco;
	private int quantidadeEmEstoque;
	private long id;
	
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}


	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}


	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Produto [nomeDoProduto=" + nomeDoProduto + ", descricao=" + descricao + ", preco=" + preco
				+ ", quantidadeEmEstoque=" + quantidadeEmEstoque + ", id=" + id + "]";
	}
}
