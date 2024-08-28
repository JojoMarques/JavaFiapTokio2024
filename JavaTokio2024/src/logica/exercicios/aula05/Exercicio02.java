package logica.exercicios.aula05;

public class Exercicio02 {

	public static void main(String[] args) {

		int num1;
		num1 = 55;
		float num2; 
		num2 = 55.5f;
		double num3;
		num3 = 55.5555;
		String str1, str2,str3;
		
		System.out.printf("Numeros: %d, %f, %f", num1, num2, num3);
		str1 = Integer.toString(num1);
		str2 = Float.toString(num2);
		str3 = Double.toString(num3);
		
		System.out.printf("\nString: %s, %s, %s", str1, str2, str3);
	}
}
