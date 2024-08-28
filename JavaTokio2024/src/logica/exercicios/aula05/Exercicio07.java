package logica.exercicios.aula05;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("entre com o valor do produto:");
		float valorProduto = scan.nextFloat();
		
		System.out.println("entre com o valor pago:");
		float valorPago = scan.nextFloat();
		
		float troco = valorPago - valorProduto;
		
		System.out.println("Valor do troco: "+troco);
		
		scan.close();
	}

}
