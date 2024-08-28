package logica.exercicios.aula05;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o nome da peca:");
		String nome_peca1 = scan.nextLine();
		System.out.println("Entre com o numero de pecas desejadas:");
		int qtd_peca1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Entre com o valor unitario da peca:");
		float valorUnitario_peca1 = scan.nextFloat();
		
		scan.nextLine();
		System.out.println("Entre com o nome da peca:");
		String nome_peca2 = scan.nextLine();
		System.out.println("Entre com o numero de pecas desejadas:");
		int qtd_peca2 = scan.nextInt();
		scan.nextLine();
		System.out.println("Entre com o valor unitario da peca:");
		float valorUnitario_peca2 = scan.nextFloat();
		
		float valor_total = (qtd_peca1*valorUnitario_peca1) + (qtd_peca2*valorUnitario_peca2);
		System.out.printf("Valor total: R$ %.2f", valor_total);

		scan.close();
	}

}
