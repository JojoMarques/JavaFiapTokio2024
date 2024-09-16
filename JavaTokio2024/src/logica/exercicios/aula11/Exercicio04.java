package logica.exercicios.aula11;
import java.util.Scanner;

public class Exercicio04 {

	static float converte_temperatura(float temp, char caractere, char tempDesejada) {
		
		float celsius = 0;
		float kelvin = 0; 
		float farenheit = 0;
		float retorno = 0;
		
		if(caractere == 'C') {
			kelvin = temp + 273;
			farenheit = (temp*1.8f) + 32;
			System.out.println("celsius: "+temp+" °C");
			System.out.println("kelvin: "+kelvin+" °K");
			System.out.println("farenheit: "+farenheit+" °F");
		}
			
		else
			if(caractere == 'K') {
				celsius = temp - 273;
				farenheit = (temp*1.8f) - 459.67f;
				System.out.println("celsius: "+celsius+" °C");
				System.out.println("kelvin: "+temp+" °K");
				System.out.println("farenheit: "+farenheit+" °F");
			}
	
	   else if(caractere == 'F') {
			celsius = temp - 32;
			kelvin = (temp - 32/1.8f) + 273;
			System.out.println("celsius: "+celsius+" °C");
			System.out.println("kelvin: "+kelvin+" °K");
			System.out.println("farenheit: "+temp+" °F");
		}
		
		switch(tempDesejada) {
			case 'C':
				retorno = celsius;
			case 'K':
				retorno = kelvin;
			case 'F':
				retorno = farenheit;
		}
		return retorno;
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com uma temperatura:");
		float temp = scan.nextFloat();
		
		scan.nextLine();
		
		System.out.println("entre com C se a temperatura estiver em Celsius, K se ela estiver em Kelvin e F se ela estiver em Farenheit:");
		char caractere = scan.nextLine().charAt(0);
		
		if(caractere == 'C' ||caractere == 'K'||caractere == 'F' )
		{
			System.out.println("entre com C se desejar retornar a temperatura em Celsius, K em Kelvin ou F em Farenheit:");
			char tempDesejada = scan.nextLine().charAt(0);

			float resultado = converte_temperatura(temp, caractere, tempDesejada);
			System.out.println("retorno solicitado: "+resultado);
		}
		else
			System.out.println("caractere inválido");
		
		scan.close();
	}

}
