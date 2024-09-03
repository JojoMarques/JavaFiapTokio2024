package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio12 {
	
		    public static void main(String[] args) {
		    	
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.print("Entre com o primero lado:");
		        double lado1 = scan.nextDouble();
		        System.out.print("Entre com o segundo lado:");
		        double lado2 = scan.nextDouble();
		        System.out.print("Entre com o terceiro lado:");
		        double lado3 = scan.nextDouble();
		        
		        // Ordena os lados em ordem decrescente
		        double[] lados = {lado1, lado2, lado3};
		        java.util.Arrays.sort(lados);
		        double A = lados[2]; // Maior lado
		        double B = lados[1];
		        double C = lados[0];
		        
		        // se forma um triângulo
		        if (A >= B + C) {
		            System.out.println("nao forma um triangulo");
		        } else {
		            // tipo de triângulo
		            if (A * A == B * B + C * C) {
		                System.out.println("triangulo retangulo");
		            } else if (A * A > B * B + C * C) {
		                System.out.println("triangulo obtusangulo");
		            } else {
		                System.out.println("triangulo acutangulo");
		            }
		            
		            // equilátero ou isósceles
		            if (A == B && B == C) {
		                System.out.println("triangulo equilatero");
		            } else if (A == B || A == C || B == C) {
		                System.out.println("triangulo isosceles");
		            }
		        }
		        
		        scan.close();
		    }
		}

