package logica.exercicios.aula06;
import java.util.Scanner;


public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int opcao;
		float consumo, valor;

		System.out.println("calculo de conta de luz:");
		System.out.println("selecione a opcao condizente ao seu caso:");
		System.out.println(" opcao: | tipo \n1 - (residencia) \n2 - (comercio) \n3 - (industria)");
		opcao = scan.nextInt();
		
		System.out.println("entre com a quantidade de KW/h consumida:");
		consumo = scan.nextFloat();
		
		switch(opcao) {
		 case 1:
			 valor = consumo * 0.60f;
			 System.out.printf("valor da conta de luz: R$ %.2f", valor);
			 break;
		 case 2:
			 valor = consumo * 0.48f;
			 System.out.printf("valor da conta de luz: R$ %.2f", valor);
			 break;
		 case 3:
			 valor = consumo * 1.29f;
			 System.out.printf("valor da conta de luz: R$ %.2f", valor);
			 break;
		default:
			System.out.println("opcao invalida.");
		}
		
		scan.close();

	}

}
