package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, resultado;
		
		System.out.println("entre com um numero:");
		numero = scan.nextInt();
		
		for(int i=0; i<=10;i++) {
			resultado = numero*i;
			System.out.printf("%d x %d = %d \n", numero, i, resultado);
		}
		
		scan.close();
	}

}
