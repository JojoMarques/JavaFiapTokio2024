package logica.exercicios.aula05;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		float a = scan.nextFloat();
		
		System.out.println("Entre com a primeira nota:");
		float b = scan.nextFloat();
		
		float media_aritmetica = (a+b)/2;
		
		System.out.println("Sua media eh:"+media_aritmetica);
	
		scan.close();
	}

}
