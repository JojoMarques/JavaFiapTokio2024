package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero, cont = 0;

		do {
			System.out.println("entre com um numero inteiro positivo:");
			numero = scan.nextInt();

			if (numero > 0)
				cont = 0;
			else {
				cont++;
				System.out.println("valor invalido. tente novamente:\n");
			}

		} while (cont> 0);
		
		System.out.println("divisores:");
		for(int i=1;i<=numero;i++) {
			if(numero%i == 0 || i%numero == 0)
				System.out.println(i);
		}
		
		scan.close();
	}
}