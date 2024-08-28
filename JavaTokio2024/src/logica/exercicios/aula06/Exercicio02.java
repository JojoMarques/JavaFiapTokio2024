package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("entre com um numero:");
		float num1 = scan.nextFloat();
		
		System.out.println("entre com outro numero:");
		float num2 = scan.nextFloat();
		
		if(num1 > num2) {
			System.out.printf("o numero %.0f eh maior", num1);
		}else if (num2>num1) {
			System.out.printf("o numero %.0f eh maior", num2);
		}else {
			System.out.printf("os numeros sao iguais");
		}
		
	}

}
