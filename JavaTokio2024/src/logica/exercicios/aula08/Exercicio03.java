package logica.exercicios.aula08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
    
		System.out.println("entre com uma palavra:");
		String palavra = scan.nextLine();
		
		int ctmaius = 0,ctminus = 0 ,ctnum = 0 ,vazio = 0;

		for (int i = 0; i < palavra.length(); i++) {
      			//maiusculo
			if ((palavra.charAt(i) >= 'A') && (palavra.charAt(i) <= 'Z')) 
				ctmaius++;
       			 // minusculo
			else if ((palavra.charAt(i) >= 'a') && (palavra.charAt(i) <= 'z')) 
				ctminus++;
          		// numerico
			else if ((palavra.charAt(i) >= '0') && (palavra.charAt(i) <= '9'))
		      ctnum++;
            	//vazio
			else if (palavra.charAt(i) == ' ')
				    vazio++;
		}
      
		System.out.println("quantidade de caracteres alfabeticos maiusculos: "+ctmaius);
		System.out.println("quantidade de caracteres alfabeticos minusculos: "+ctminus);
		System.out.println("quantidade de caracteres numericos: "+ctnum);			
		System.out.println("quantidade de espacos em branco: "+vazio);

      scan.close();
	
}
}
