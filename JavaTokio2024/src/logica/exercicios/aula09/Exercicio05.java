package logica.exercicios.aula09;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		for(int i=1; i<=12; i++) {
			if (i==2) //fevereiro
				System.out.println("O Mês de "+meses[i-1]+" tem 28 dias ao todo.");
				else 
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) 
						System.out.println("O Mês de "+meses[i-1]+" tem 31 dias ao todo.");
				else 
				System.out.println("O Mês de "+meses[i-1]+" tem 30 dias ao todo.");
			
		}
		scan.close();
	}
}