package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		float distancia, combustivel, consumo;
		
		System.out.println("entre com a distancia total percorrida (em km):");
		distancia = scan.nextFloat();
		
		System.out.println("entre com o total de combustível gasto (em l):");
		combustivel = scan.nextFloat();
		
		consumo = distancia/combustivel;
		
		System.out.printf("consumo: %.2f km/litro\n", consumo);
		if(consumo <8)
			System.out.println("Esse carro bebe, hein!");
		else
			System.out.println("Autonomia legal");
		
		scan.close();
	}

}
