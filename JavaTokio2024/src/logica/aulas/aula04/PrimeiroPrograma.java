package logica.aulas.aula04;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		System.out.println("Hello, world!");
		
		int idade;
		idade = 18;
		System.out.println(idade);
		
		double salario = 1530.24;
		System.out.println(salario);

		String nome = "Jojo";
		System.out.println(nome);
		
		System.out.println("Bem-vinda, "+nome+"!");
		System.out.println(nome+", voce tem "+idade+" anos.");
		
		System.out.printf("Bem-vinda, %s! e voce tem %d anos", nome, idade);
		System.out.println("\nidade = " +(idade+idade));
		System.out.println("idade = "+idade);
	}

}