package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("entre com a primeira nota:");
		float nota1 = scan.nextFloat();
		System.out.println("entre com a segunda nota:");
		float nota2 = scan.nextFloat();
		System.out.println("entre com a terceira nota:");
		float nota3 = scan.nextFloat();
		System.out.println("entre com a quarta nota:");
		float nota4 = scan.nextFloat();
		
		float media = (nota1+nota2+nota3+nota4)/4;
		
		if(media >= 7)
			System.out.println("Aprovado.");
		else if(media>=5)
			System.out.println("Em recuperação");
		else if(media<5)
			System.out.println("Reprovado.");
		
		scan.close();
	}

}
