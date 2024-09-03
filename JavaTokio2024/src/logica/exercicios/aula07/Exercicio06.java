package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		System.out.println("entre com um numero:");
		numero = scan.nextInt();
		
		System.out.printf("pares entre 2 e %d:\n", numero);
		for(int i=4;i<numero;i+=2) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
