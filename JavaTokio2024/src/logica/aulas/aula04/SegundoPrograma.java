package logica.aulas.aula04;
import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		System.out.printf("Número  digitado: %d",num);

		System.out.println("\nDigite a sua idade:");
		System.out.println("Sua idade é: "+ scan.nextInt());
	
		scan.close();
		}

}