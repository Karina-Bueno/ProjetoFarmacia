package org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // tranforma em tabela
@Table(name = "tb_produto") // nomear a tabela
public class Produto {

	@Id // chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremente
	private long id; // long equivale ao int, tem maior espaço de armazenamento do que o int

	@NotNull // obriga que o usuario coloque um titulo na postagem
	private String nome;

	@NotNull // determina um min e um max de caracteres
	private float preco;

	@NotNull
	private int quantidade;
	
	@NotNull
	private boolean receita;

	@ManyToOne  //tipo de relacionamento entre tabelas 
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean getReceita() {
		return receita;
	}

	public void setReceita(boolean receita) {
		this.receita = receita;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}