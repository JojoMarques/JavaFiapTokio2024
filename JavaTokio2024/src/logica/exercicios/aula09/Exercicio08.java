package logica.exercicios.aula09;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("entre com um número inteiro:");
        int n = scan.nextInt();
        scan.nextLine(); 
        
        char[] vetor = new char[n];
        
        System.out.println("entre com " + n + " caracteres:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scan.nextLine().charAt(0);
        }
           
        int meio = n / 2;
        for (int i = 0; i < meio; i++) {
            char temp = vetor[i];
            vetor[i] = vetor[n - 1 - i];
            vetor[n - 1 - i] = temp;
        }
        
        System.out.println("Vetor invertido:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        scan.close();
    }
}
