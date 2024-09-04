package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		float a, b, resultado;

		System.out.println("entre com um numero:");
		a = scan.nextFloat();
		
		scan.nextLine();
		
		System.out.println("entre com um operador matematico (+, -, *, /)");
		char operador = scan.nextLine().charAt(0);
		
		System.out.println("entre com outro numero:");
		b = scan.nextFloat();
		
		switch(operador) {
			case '+':
				resultado = a+b;
				System.out.println("soma = "+resultado);
				break;
			case '-':
				resultado = a-b;
				System.out.println("subtracao = "+resultado);
				break;
			case '*':
				resultado = a*b;
				System.out.println("multiplicacao = "+resultado);
				break;
			case '/':
				if(b != 0) {
					resultado = a/b;
					System.out.println("divisao = "+resultado);
				}
				else
					System.out.println("operacao invalida");
				break;
				
			default:
				System.out.println("operador invalido.");
				
				scan.close();
		}
	}

}
