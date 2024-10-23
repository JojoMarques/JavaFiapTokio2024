package java_poo.exercicios.aula01;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		float novoPreco = 0.0f;

		System.out.println("entre com o total da compra: ");
		float totalCompras = scan.nextFloat();
				
		scan.nextLine();
		
		System.out.println("entre com o cupom: ");
		String cupom = scan.nextLine();
		
		if(totalCompras >=500 || cupom.equals("DESCONTO10")) {
			novoPreco = 0.9f*totalCompras;
			System.out.println("novo preço com desconto de 10% aplicado: R$"+novoPreco);
	}


	}

}
