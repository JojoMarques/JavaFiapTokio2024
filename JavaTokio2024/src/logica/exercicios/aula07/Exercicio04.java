package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("entre com 10 numeros:");
		for(int i=0;i<10;i++) {
			numero = scan.nextInt();
			soma+=numero;
		}
		
		System.out.println("soma ="+soma);
		
		scan.close();
	}

}
