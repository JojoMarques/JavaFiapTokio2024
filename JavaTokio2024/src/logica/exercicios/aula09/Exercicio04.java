package logica.exercicios.aula09;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com a quantidade de alunos: ");
		int qtdAlunos = scan.nextInt();	
	
		double[] notas = new double[qtdAlunos];
		double soma = 0.0;
		double media = 0.0;
		
		int iguais=0;
		int acima=0;
		int abaixo=0;
		
		System.out.println("entre com as notas do aluno: ");
		for (int i=0; i<qtdAlunos; i++) {
			notas[i]=scan.nextDouble();
		}
		
		for (int i=0; i<qtdAlunos; i++) {
			soma+=notas[i];
		}
		
		media = soma/qtdAlunos;
	
		for (int i=0; i<qtdAlunos; i++) {
			if (notas[i] == media) {
				iguais ++;
				
			} else if (notas[i] > media) {
				acima++;
			} else {
				abaixo++;
			}
		}
		
		System.out.printf("notas da turma: ");
		for (int i=0; i<qtdAlunos; i++) {
			System.out.printf("\n%.2f", notas[i]);
		}
		
		System.out.println("\nmedia: "+media);
		
		System.out.println("notas acima da media: "+media);
		
		System.out.println("notas abaixo media: "+abaixo);
		
		System.out.println("notas na media: "+iguais);
		
		scan.close();
	}

}