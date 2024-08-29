package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int codigoEstado, codigoCarga;
		float pesoCarga, precoCarga = 0.0f, pesoConvertido, imposto = 0.0f, valorTotal;
		
		System.out.println("entre com o codigo do estado");
		codigoEstado = scan.nextInt();
		
		System.out.println("entre com o peso da carga do caminhão em toneladas");
		pesoCarga = scan.nextFloat();
		
		System.out.println("entre com o codigo da carga:");
		codigoCarga = scan.nextInt();
		
		
		pesoConvertido = pesoCarga*1000;
		System.out.printf("peso da carga em convertido em kg: %.0f\n",pesoConvertido );
		
		if(codigoCarga >= 10 && codigoCarga <=20 ){
			precoCarga = pesoConvertido*100;
			System.out.printf("preco da carga do caminhao: R$%.0f\n",precoCarga);
		}else 
			if (codigoCarga > 20 && codigoCarga <=30 ) {
			precoCarga = pesoConvertido*250;
			System.out.printf("preco da carga do caminhao: R$%.0f\n",precoCarga);
		}else 
			if (codigoCarga > 30 && codigoCarga <=40 ) {
			precoCarga = pesoConvertido*340;
			System.out.printf("preco da carga do caminhao: R$%.0f",precoCarga);
		}else {
			System.out.println("código inválido");
		}
				
		switch(codigoEstado) {
		 	case 1:
				imposto = 0.35f;
				break;
		 	case 2:
				imposto = 0.25f;
				break;	
		 	case 3:
				imposto = 0.15f;
				break;
		 	case 4:
				imposto = 0.05f;
				break;
		 	case 5:
				imposto = 0f;
				break;
			default:
				System.out.println("código de estado inválido.");
		}
		
		valorTotal = precoCarga+(precoCarga*imposto);
		
		System.out.printf("valor do imposto cobrado: R$%.0f\n", imposto*precoCarga);
		System.out.printf("valor total transportado: R$%.0f",valorTotal);
		
		scan.close();
	}

}
