package logica.exercicios.aula05;
import java.util.Scanner; 

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("entre com os anos:");
		int anos = scan.nextInt();

		System.out.println("entre com os meses:");
		int meses = scan.nextInt();

		System.out.println("entre com os dias:");
		int dias = scan.nextInt();
		
		int diasTotais = (anos*365)+(meses*30)+dias;
		
		System.out.println("dias vividos:"+diasTotais);
		
		scan.close();
	}

}
