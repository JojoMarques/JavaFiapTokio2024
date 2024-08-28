package logica.exercicios.aula05;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//aaaaa
		System.out.println("Entre com a primeira nota:");
		float a = scan.nextFloat();
		
		System.out.println("Entre com a primeira nota:");
		float b = scan.nextFloat();
		
		float media_ponderada = (0.4f*a)+(0.6f*b);
		
		System.out.println("Sua media eh:"+media_ponderada);
	
		scan.close();
	}

}