package logica.exercicios.aula10;
import java.util.Scanner;

public class Exercicio05 {

	static void converte_temperatura(float temp, char caractere) {
		
		float celsius = 0;
		float kelvin = 0; 
		float farenheit = 0;
		
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
				
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com uma temperatura:");
		float temp = scan.nextFloat();
		
		scan.nextLine();
		
		System.out.println("entre com C se a temperatura estuver em Celsius, K se ela estiver em Kelvin e F se ela estiver em Farenheit:");
		char caractere = scan.nextLine().charAt(0);
		
		if(caractere == 'C' ||caractere == 'K'||caractere == 'F' )
			converte_temperatura(temp, caractere);
		else
			System.out.println("caractere inválido");
		
		scan.close();
	}

}
