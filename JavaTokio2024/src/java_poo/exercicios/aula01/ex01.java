package java_poo.exercicios.aula01;

public class ex01 {

	public static void main(String[] args) {
		
		/*
		for(int i=0; i<=100;i+=2) {
			System.out.println(i);
		}
		*/
		
		//melhor jeito:
		for(int i=0;i<=100;i++) {
			if(i%2 == 0)
				System.out.println(i);
		}


	}

}
