package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int maior=0, menor=0;
		
		System.out.println("entre com 12 numeros inteiros");
		for(int i=0;i<12;i++) {
			int numero = scan.nextInt();
			
			if(numero>maior)
				maior = numero;
			else
				menor = numero;	
		}
		
		System.out.println(maior);
	}

}
