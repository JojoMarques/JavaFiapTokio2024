package br.com.fiap.model;

import java.sql.Date; // antes importava o java.util.Date, agora é o java.sql.Date (específico pra trabalhar com BDD)

// essa classe é um JavaBeans (só tem atributos, construtor e getters/setters)
public class Usuario {

	private long id; // vai ser autoincrementado no banco
	private String nome;
	private String email;
	private Date dataCadastro; // vai pegar a do sistema no nomento da criação

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataCadastro = new Date(System.currentTimeMillis()); // vai ajustar depois
	}

	/*
	 * pra depois (no UsuarioDAO), eu conseguir criar o objeto com todas as
	 * informações // ou deixava ele vazio tbm (aí cria como quiser) public
	 * Usuario(long id, String nome, String email, Date dataCadastro) { this.id =
	 * id; this.nome = nome; this.email = email; this.dataCadastro = dataCadastro; }
	 */

	public Usuario() {

	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
