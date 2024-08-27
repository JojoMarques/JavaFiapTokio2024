package logica.exercicios.aula04;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com sua idade:");
		int idade = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Entre com seu nome:");
		String nome = scan.nextLine();
		
		System.out.printf("Olá, %s. Você tem %d anos.", nome, idade);
	}

}
