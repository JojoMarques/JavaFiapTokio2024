package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio02 {

	public static void main(String[] args) {
    
		Calendar calendar = Calendar.getInstance();
    
		if(calendar.get(Calendar.DAY_OF_WEEK) == 3)
			System.out.println("hoje é terça-feira, tem feira de rua.");
	}

}
