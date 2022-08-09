package br.com.senai.aula1907.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produtos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Integer id_categoria;
	private Float preco_venda;
	private Float preco_custo;
	private Float margem_lucro;
	private String foto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}
	public Float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(Float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public Float getPreco_custo() {
		return preco_custo;
	}
	public void setPreco_custo(Float preco_custo) {
		this.preco_custo = preco_custo;
	}
	public Float getMargem_lucro() {
		return margem_lucro;
	}
	public void setMargem_lucro(Float margem_lucro) {
		this.margem_lucro = margem_lucro;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
		
}
