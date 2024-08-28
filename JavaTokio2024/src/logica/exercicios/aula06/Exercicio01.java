package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("entre com um número");
		int numero = scan.nextInt();
		
		if(numero%2==0)
			System.out.println("o numero eh par");
		else
			System.out.println("o numero eh impar");
		
		
	}

}
