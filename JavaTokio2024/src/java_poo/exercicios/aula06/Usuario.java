package java_poo.exercicios.aula06;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Usuario implements Comparable<Usuario> {

	private int idUsuario;
	private String nome;
	private String senha;

	public Usuario(int idUsuario, String nome, String senha) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", senha=" + senha + "]";
	}

	// esse metodo eh o parametro que ele tem pra ordenar pelo ID
	@Override
	public int compareTo(Usuario user) {
		if (this.getIdUsuario() < user.getIdUsuario()) {
			return -1;
		}
		if (this.getIdUsuario() > user.getIdUsuario()) {
			return 1;
		}
		return 0;
	}

	// método de remoção
	public List<Usuario> remover(String nome, List<Usuario> list) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return list;
	}
	
	/*public void recuperaObjeto(String chave, Map mapa) {
		for(Usuario usuario: mapa) {
			if()
				System.out.println("encontrou");
			else
				System.out.println("nao encontrou");
		}
	}*/

}
