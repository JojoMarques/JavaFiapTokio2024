package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("entre com um valor inteiro:");
		int a = scan.nextInt();
		
		System.out.println("entre com outro valor inteiro:");
		int b = scan.nextInt();
		
		if(a%b == 0 || b%a == 0)
			System.out.println("Sao multiplos");
		else
			System.out.println("Nao sao multiplos");
		
		scan.close();
	}

}
