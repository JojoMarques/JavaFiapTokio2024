package logica.exercicios.aula09;
import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("entre com um numero inteiro:");
		int n = scan.nextInt();
		
		double [] vetor = new double[n]; 
		
		for (int i=0; i<n;i++) {
			vetor[i] = r.nextFloat(1,n);
		}
		System.out.println("valores do vetor:");
		for (int i=0; i<n;i++) {
			System.out.println(vetor[i]);
		}
		
		scan.close();
	}

}
