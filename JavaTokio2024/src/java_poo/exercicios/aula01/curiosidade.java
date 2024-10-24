package java_poo.exercicios.aula01;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class curiosidade {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		
		float novoPreco = 0.0f;

		double valor1 =  Double.parseDouble(JOptionPane.showInputDialog("valor 1:"));
		double valor2 =  Double.parseDouble(JOptionPane.showInputDialog("valor 2:"));
		
		double res = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null, "Soma: "+res);
		
		//o retorno é sempre String.

	}

}
