package java_poo.exercicios.aula01;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("\n\n\tHello world");

		byte numeroByte = 5;
		short numeroShort = 100;
		int numeroInt = 1000;
		long numeroLong = 1000000000000000000l;
		float numeroFloat = 55.555f;
		double numeroDouble = 16.6666666;

		char caractere = 'J';
		String nome = "Jojo";
		boolean tipoBool = true;

		// fazendo casting: conversão de tipos
		numeroInt = (int) numeroFloat;
		// caractere = (char)nome; --> não dá pra fazer de String pra char
		numeroDouble = numeroFloat; // --> como double é maior (dupla precisão), cabe cerinho
		numeroFloat = (float) numeroDouble;
		// numeroInt = (int)tipoBool; --> não dá pra fazer de boolean pra int
		numeroDouble = numeroLong;
		numeroInt = (int) numeroLong;

		System.out.println("numero byte: " + numeroByte);
		System.out.println("numero short: " + numeroShort);
		System.out.println("numero int: " + numeroInt);
		System.out.println("numero long: " + numeroLong);
		System.out.println("numero float: " + numeroFloat);
		System.out.println("numero double: " + numeroDouble);
		System.out.println("caractere: " + caractere);
		System.out.println("boolean: " + tipoBool);

	}

}
