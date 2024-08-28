package logica.exercicios.aula05;
import java.util.Scanner; 

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int unidade, dezena, centena;
		
		System.out.println("entre com um número:");
		int numero = scan.nextInt();
		
		centena = numero/100;
		dezena = (numero%100)/10;
		unidade = ((numero%100)%10);
		
		System.out.println("Centena = "+centena);
		System.out.println("Dezena = "+dezena);
		System.out.println("Unidade = "+unidade);

		scan.close();
	}

}
