package logica.exercicios.aula09;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com um numero:");
		int qtd = scan.nextInt();	
	
		int[] vetor = new int[qtd];
		int soma = 0;
		
		for (int i=0; i<qtd; i++) {
			System.out.printf("entre com o %d° numero:", i+1);
			vetor[i] = scan.nextInt();
		}
	
		for (int i=0; i<qtd; i++) {
			soma += vetor[i];
		}
		
		System.out.println("\nsoma: "+soma);
		
		scan.close();
	}

}