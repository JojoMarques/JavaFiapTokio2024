package br.com.fiap.jdbc.model;

import java.sql.Date;

public class Candidato {

	private long idCandidato; // primary key
	private String nome;
	private Date data_nasc;
	private float tempo_experiencia;
	private String formacao;
	private String telefone;
	private String email;
	private String endereco;
	private long idArea; // foreign key
	private Genero genero;
	// enum: qnd tiver uma lista de possíveis escolhas

	public Candidato(String nome, Date data_nasc, float tempo_experiencia, String formacao, String telefone,
			String email, String endereco, Genero genero, long idArea) {
		super();
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.tempo_experiencia = tempo_experiencia;
		this.formacao = formacao;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.genero = genero;
		this.idArea = idArea;
	}

	public Candidato() {

	}

	public long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(long idCantidato) {
		this.idCandidato = idCantidato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public float getTempo_experiencia() {
		return tempo_experiencia;
	}

	public void setTempo_experiencia(float tempo_experiencia) {
		this.tempo_experiencia = tempo_experiencia;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
