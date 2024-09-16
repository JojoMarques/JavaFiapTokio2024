package logica.exercicios.aula11;
import java.util.Scanner;

public class Exercicio01 {

	static float calcularArea(float largura, float comprimento) {
		float area = largura*comprimento;
		
		return area;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float largura, comprimento, area;
		
		System.out.print("entre com a largura do terreno:");
		largura = scan.nextFloat();
		
		System.out.print("entre com o comprimento do terreno:");
		comprimento = scan.nextFloat();
		
		area = calcularArea(largura, comprimento);
		
		System.out.println("área do terreno = "+area);
		scan.close();
	}

}
