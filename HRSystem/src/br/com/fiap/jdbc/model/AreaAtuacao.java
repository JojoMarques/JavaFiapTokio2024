package br.com.fiap.jdbc.model;

public class AreaAtuacao {

	private long idArea; // primary key
	private String nome;

	public AreaAtuacao(String nome) {
		super();
		this.nome = nome;
	}

	public AreaAtuacao() {

	}

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
