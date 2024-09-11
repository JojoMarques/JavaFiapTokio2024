package logica.exercicios.aula10;
import java.util.Scanner;

public class Exercicio02 {

	static void calcularArea(float largura, float comprimento) {
		float area = largura*comprimento;
		
		System.out.println("área do terreno = "+area);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float largura, comprimento;
		
		System.out.print("entre com a largura do terreno:");
		largura = scan.nextFloat();
		
		System.out.print("entre com o comprimento do terreno:");
		comprimento = scan.nextFloat();
		
		calcularArea(largura, comprimento);
	}

}
