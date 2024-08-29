package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		float salario, aumento, novoSalario, reajuste;
		
		System.out.println("entre com o seu salario: ");
		salario = scan.nextFloat();
		
		if(salario < 280)
			reajuste = 0.2f;
		else if(salario >= 280 && salario <700)
			reajuste = 0.15f;
		else if(salario >=700 && salario<1500)
			reajuste = 0.10f;
		else
			reajuste = 0.05f;
		
		novoSalario = salario + (salario*reajuste);
		aumento = novoSalario - salario;
		
		System.out.println("salario antes do reajuste: R$ "+salario);
		System.out.println("percentual de aumento aplicado: "+ reajuste*100+ "%");
		System.out.printf("valor do aumento: R$ %.2f",aumento);
		System.out.printf("\nnovo salario: R$ %.2f",novoSalario);
		
		scan.close();
	}

}
