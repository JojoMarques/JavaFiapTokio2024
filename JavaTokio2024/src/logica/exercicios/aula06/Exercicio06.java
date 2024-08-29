package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("entre com seu ano de nascimento:");
		int ano = scan.nextInt();
		
		if(2024-ano >= 18 && 2024-ano <70)
			System.out.println("\no voto eh obrigatorio este ano.");
		else if(2024-ano == 16 || 2024-ano >= 70)
			System.out.println("\no voto eh opcional este ano.");
		else if(2024-ano < 16)
			System.out.println("\no voto eh proibido este ano.");
		
		scan.close();
	}

}
