package logica.exercicios.aula11;
import java.util.Scanner;

public class Exercicio03 {

	static float calcula(char operador, float a, float b ) {
		float resultado = 0;
		
		switch(operador) {
		case '+':
			resultado = a+b;
			break;
		case '-':
			resultado = a-b;
			break;
		case '*':
			resultado = a*b;
			break;
		case '/':
			if(b != 0) {
				resultado = a/b;
			}
			else
				System.out.println("operacao invalida");
			break;
			
		default:
			System.out.println("operador invalido.");
}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float a, b, resultado;
		
		System.out.println("entre com um numero:");
		a = scan.nextFloat();
		
		scan.nextLine();
		
		System.out.println("entre com um operador matematico (+, -, *, /)");
		char operador = scan.nextLine().charAt(0);
		
		System.out.println("entre com outro numero:");
		b = scan.nextFloat();
		
		resultado = calcula(operador, a, b);
		System.out.println("resultado = "+resultado);
		scan.close();
	}

}
