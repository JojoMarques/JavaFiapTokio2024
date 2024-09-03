package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		
		
		do{
			System.out.println("Olá, mundo\n");
			
			System.out.println("Deseja exibir a mensagem novamente?");
			System.out.println("Digite 0 para não e 1 para sim:");
			int opcao = scan.nextInt();
			
			switch(opcao) {
			case 0:
				cont = 0;
				break;
			case 1:
				cont++;
				break;
			default:
				System.out.println("opção inválida");
				cont = 0;
			}
		}while(cont != 0);
		
			System.out.println("Fim.");
		
		scan.close();
	}

}
