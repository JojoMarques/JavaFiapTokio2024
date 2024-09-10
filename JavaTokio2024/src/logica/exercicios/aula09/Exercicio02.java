package logica.exercicios.aula09;

public class Exercicio02 {

	public static void main(String[] args) {

		String s = "FIAPTOKIO";
		char[] r = new char[9];
		
		for (int i = s.length() - 1; i >= 0; i--) {
			r[i] = s.charAt(i);
		}
		
		for (char letra: r) {
			System.out.print(letra);
		} //alternativa B
	}

}
