package logica.exercicios.aula10;
import java.util.Scanner;

public class Exercicio03 {

	static void voto(int idade) {
		
		if(idade>= 18 && idade <70)
			System.out.println("\no voto eh obrigatorio.");
		else if(idade == 16 || idade >= 70)
			System.out.println("\no voto eh opcional.");
		else if(idade < 16)
			System.out.println("\no voto eh proibido.");
		
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("entre com a sua idade:");
		int idade = scan.nextInt();
		
		voto(idade);
		
		scan.close();
	}

}
