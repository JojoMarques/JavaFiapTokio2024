package java_poo.exercicios.aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList();

		usuarios.add(new Usuario(1, "Jojo", "sainz"));
		usuarios.add(new Usuario(5, "Carlos", "ferrari"));
		usuarios.add(new Usuario(3, "Mi", "taylor"));
		usuarios.add(new Usuario(2, "João", "sabrina"));
		usuarios.add(new Usuario(4, "Maris", "popi"));
		
		System.out.println("lista antes de ordenar os IDs pelo sort:");
		for (Usuario usuario: usuarios) {
			System.out.println(usuario.getIdUsuario());
		}
		
		// ordenando
		Collections.sort(usuarios);
		
		System.out.println("lista depois de ordenar os IDs pelo sort:");
		for(Usuario usuario: usuarios) {
			System.out.println(usuario.getIdUsuario());
		}

	}

}
