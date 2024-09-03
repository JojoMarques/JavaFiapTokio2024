package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double media, nota;
		int qtd = 0;
		
		System.out.println("entre com a media da turma:");
		media = scan.nextDouble();
		
		for(int i=1;i<=20;i++) {
			System.out.printf("entre com a nota do %d° aluno:",i);
			nota = scan.nextDouble();
			
			if(nota>media)
				qtd+=1;
		}
		
		System.out.printf("\n%d alunos tiveram nota superior a media da turma.", qtd);

		scan.close();
	}
}
