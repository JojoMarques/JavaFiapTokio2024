package logica.exercicios.aula11;
import java.util.Scanner;

public class Exercicio02 {

	static String voto(int idade) {
		
		String resultado = null;
		
		if(idade>= 18 && idade <70)
			resultado = "\no voto eh obrigatorio.";
		else if(idade == 16 || idade >= 70)
			resultado = "\no voto eh opcional.";
		else if(idade < 16)
			resultado = "\no voto eh proibido.";
		
		return resultado;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("entre com a sua idade:");
		int idade = scan.nextInt();
		
		String resultado;
		
		resultado = voto(idade);
		
		System.out.println(resultado);
		
		scan.close();
	}

}
