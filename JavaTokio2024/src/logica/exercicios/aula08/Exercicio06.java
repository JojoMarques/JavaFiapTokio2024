package logica.exercicios.aula08;
import java.util.Random;

public class Exercicio06 {

	public static void main(String[] args) {

		Random r = new Random();
		int qtdPar = 0, qtdImpar = 0, qtdPrimos = 0;
		int num = 0, cont = 0;
		
		for(int i=0; i<=9;i++) {
			num = r.nextInt(1,10);
			System.out.println(num);
			if(num%2 == 0)
				qtdPar++;
			else if (num%2 != 0)
				qtdImpar++;
			
		for (int j = 1; j <=num; j++) {
				if(num%j==0)
					cont++;
			}
		    if(cont==2)	
		    	qtdPrimos++;
		    cont = 0;
		}
		
		System.out.println("qtd pares:"+qtdPar);
		System.out.println("qtd impares:"+qtdImpar);
		System.out.println("qtd primos: "+qtdPrimos);
		
	}

}
