package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		//terminar
		Scanner scan = new Scanner(System.in);

		int numero= 2000, primo = 0;
		
		for(int i=2;i<=numero;i++) {
			for(int j=1;j<=numero;j++) {
				if(numero%j == 0)
					if(j == 1 || j == numero) {
						primo = numero;
				}	
			}
			System.out.println(primo);
		}
		scan.close();
	}
	
}
