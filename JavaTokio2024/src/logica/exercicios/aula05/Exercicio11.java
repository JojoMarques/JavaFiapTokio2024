package logica.exercicios.aula05;
import java.util.Scanner; 

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int anos,meses;
	
		System.out.println("entre com a idade em dias:");
		int dias = scan.nextInt();
		
		anos = dias/365;
		meses = (dias%365)/30; //o que sobrou dos anos.
		dias = (dias%365)%30 ;
		
		System.out.printf("idade: %d anos, %d meses, %d dias. ", anos,meses,dias);
		
		scan.close();
	}

}