package java_poo.exercicios.aula01;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("entre com o usuario:");
		String usuario = scan.nextLine();
		
		System.out.println("entre com a senha:");
		String senha = scan.nextLine();

		//System.out.println(usuario);
		//System.out.println(senha);

		if(usuario.equals("administrador") && senha.equals("123"))
			System.out.println("iguais.");

	}

}
