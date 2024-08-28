package logica.exercicios.aula05;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com seu nome:");
		String nome = scan.nextLine();
		
		System.out.println("Digite a opcao correspondente ao seu genero:");
		System.out.println("[M] masculino\n [F] feminino\n [O] outro\n [N] nao responder");
		char opcao = scan.nextLine().charAt(0);
		
		System.out.printf("Ola, %s! Voce escolheu a seguinte opcao de genero: %c", nome, opcao);
		
		scan.close();
	}

}
