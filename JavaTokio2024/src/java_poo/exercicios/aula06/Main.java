package java_poo.exercicios.aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList();

		usuarios.add(new Usuario(1, "Jojo", "sainz"));
		usuarios.add(new Usuario(5, "Carlos", "ferrari"));
		usuarios.add(new Usuario(3, "Mi", "taylor"));
		usuarios.add(new Usuario(2, "Jo�o", "sabrina"));
		usuarios.add(new Usuario(4, "Maris", "popi"));

		System.out.println("lista antes de ordenar os IDs pelo sort:");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getIdUsuario());
		}

		// ordenando
		Collections.sort(usuarios);

		System.out.println("lista depois de ordenar os IDs pelo sort:");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getIdUsuario());
		}

		// criando usu�rio teste para remo��o
		Usuario teste = new Usuario(6, "Teste", "testando");

		usuarios.add(teste);

		// antes da remo��o:
		System.out.println("lista antes da remo��o:");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.toString());
		}

		/*
		 * List<Usuario> listaAtualizada = new ArrayList();
		 * 
		 * listaAtualizada = teste.remover("Teste", usuarios);
		 */

		teste.remover("Teste", usuarios);

		System.out.println("\nlista ap�s a remo��o:");
		// lista ap�s remo��o
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.toString());
		}

		// criando um mapa
		Map<String, Usuario> mapa = new HashMap<>();
		// passa a chave, instancia�ao
		mapa.put("jo", new Usuario(1, "Jojo", "sainz"));

		Usuario usuario = mapa.get("jo");
		System.out.println("\nretornando o nome do usuario encontrado no mapa atrav�s da busca pela chave");
		System.out.println(usuario.getNome());

		// ele criou uma lista do tipo Usuario e adicionou nessa lista o objeto que ele
		// encontrou no map com aquela chave

	}

}
