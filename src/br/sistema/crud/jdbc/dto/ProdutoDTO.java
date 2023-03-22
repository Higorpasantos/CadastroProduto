package br.sistema.crud.jdbc.dto;

import java.util.Date;

public class ProdutoDTO {
	
	private Integer idProduto;
	private String nome;
	private String descricao;
	private Long valor;
	private Character disp_venda;
	
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public Character getDispVenda() {
		return disp_venda;
	}
	public void setDispVenda(Character disp_venda) {
		this.disp_venda = disp_venda;
	}
	

}
