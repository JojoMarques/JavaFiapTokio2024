package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero, cont = 0, soma=0;

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
		
		for(int i=1;i<=numero;i++) {
			soma+=i;
		}
		System.out.printf("a soma de 1 até %d é: %d", numero, soma);
		scan.close();
	}

}
