package logica.exercicios.aula11;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float a, b;

		System.out.println("entre com um numero:");
		a = scan.nextFloat();

		scan.nextLine();

		System.out.println("entre com um operador matematico (+, -, *, /)");
		char operador = scan.nextLine().charAt(0);

		System.out.println("entre com outro numero:");
		b = scan.nextFloat();

		System.out.println("resultado:" + OperacoesMatematicas.chamaFuncao(a, operador, b));
	}
}
