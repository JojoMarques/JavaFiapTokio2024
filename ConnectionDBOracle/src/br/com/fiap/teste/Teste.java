package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario1 = new Usuario("Jojo", "jojo@gmail.com");
		Usuario usuario2 = new Usuario("João", "joao@gmail.com");
		Usuario usuario3 = new Usuario("Mih", "mimi@gmail.com");
		Usuario usuario4 = new Usuario("Maris", "maris@gmail.com");
		Usuario usuario55 = new Usuario("Carlos Sainz", "cabron@gmail.com");

		
		// inserir usuários no banco
		dao.insert(usuario1);
		dao.insert(usuario2);
		dao.insert(usuario3);
		dao.insert(usuario4);
		dao.insert(usuario55);

		// buscar todos os usuários
		List<Usuario> lista = new ArrayList<Usuario>();
		lista = dao.selectAll();
		for (Usuario usuario : lista) {
			System.out.println("Nome:" + usuario.getNome());
			System.out.println("Email:" + usuario.getEmail());
		}
/*
		// deletar usuário no banco
		dao.delete(39l); // o id vai aumentando a cada rodada, então tem que ir colocando um diferente
		lista = dao.selectAll();
		
		System.out.println("\t\tPós deleção:");
		for (Usuario usuario : lista) {
			System.out.println("Nome:" + usuario.getNome());
			System.out.println("Email:" + usuario.getEmail());
		}

	
		Usuario sainzUpdate = dao.selectById(5);
		// pela lógica, vc pega o usuário, seta novas informações e joga ele no update
		// update dos usuários
		sainzUpdate.setEmail("carlossainz@gmail.com");
		dao.update(sainzUpdate);
		
		lista = dao.selectAll();
		
		for (Usuario usuario : lista) {
			System.out.println("Nome:" + usuario.getNome());
			System.out.println("Email:" + usuario.getEmail());
		}*/
	}

}
