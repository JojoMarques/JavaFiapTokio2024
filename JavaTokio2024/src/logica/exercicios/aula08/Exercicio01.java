package logica.exercicios.aula08;
import java.util.Scanner;
import java.util.Calendar;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (system.in);

		String nome;
		int hora;
		
		System.out.println("entre com seu nome:");
		nome = scan.nextLine();

		Calendar calendar = Calendar.getInstance();
		hora = calendar.get(Calendar.HOUR_OF_DAY);

		if(hora>=6 && hora<12)
			System.out.println("bom dia, "+nome);
		if(hora>12 && hora<18)
			System.out.println("boa tarde, "+nome);
		else
			System.out.println("boa noite, "+nome);

	}

}
