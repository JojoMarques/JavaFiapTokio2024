package logica.exercicios.aula05;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com o valor em reais:");
		float valorReais = scan.nextFloat();
		
		float valorDolar = (valorReais/5.54f);
		float valorEuro = (valorReais/6.16f);
		float valorPesoArgentino = (valorReais/0.0058f);
		float valorLibraEsterlina = (valorReais/7.30f);
		float valorIene = (valorReais/0.038f);
		
		System.out.printf("Valor em real: %.2f",valorReais);
		System.out.printf("\nValor em dólar: %.2f",valorDolar);
		System.out.printf("\nValor em euro: %.2f",valorEuro);
		System.out.printf("\nValor em peso argentino: %.2f",valorPesoArgentino);
		System.out.printf("\nValor em libra esterlina: %.2f",valorLibraEsterlina);
		System.out.printf("\nValor em iene: %.2f",valorIene);
		
		scan.close();
	}

}
