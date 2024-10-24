package java_poo.exercicios.aula01;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("peso metal 1: "); 
		float pesoMetal_1 = scan.nextFloat();
		System.out.println("peso metal 2: "); 
		float pesoMetal_2 = scan.nextFloat();
		System.out.println("peso metal 3: "); 
		float pesoMetal_3 = scan.nextFloat();
		
		//tá assim "bagunçado" pq ele pediu pra fazer com laço encadeado.
		if(pesoMetal_1 > pesoMetal_2) {
			if(pesoMetal_1 > pesoMetal_3) {
				System.out.println("o metal mais pesado eh o 1: "+pesoMetal_1);
			}
		}
		else 
			if(pesoMetal_2>pesoMetal_3) {
				System.out.println("o metal mais pesado eh o 2: "+pesoMetal_2);
			}
		else 
			if (pesoMetal_1 == pesoMetal_2 && pesoMetal_2 == pesoMetal_3){
			System.out.println("pesos iguais.");
			}
		else
			System.out.println("o metal mais pesado eh o 3:"+pesoMetal_3);	
	}
	
	//quando usa 2 &, vc garante que ele parte pra outra verificação (se colocar só 1, se ele atender a primeira, ele nem olha a segunda).

}
