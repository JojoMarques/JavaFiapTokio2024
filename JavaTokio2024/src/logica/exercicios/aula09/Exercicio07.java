package logica.exercicios.aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(); //pq ai nao preciso definir uma qtd inicial
        
        System.out.println("Entre com os nomes (aprete Enter sem digitar nenhum nome para parar):");
        
        while (true) {
            String entrada = scan.nextLine();
            if (entrada.isEmpty()) {
                break;
            }
            nomes.add(entrada);
        }
        
        String[] nomesInverso = new String[nomes.size()];
        
        for (int i = 0; i < nomes.size(); i++) {
            nomesInverso[i] = nomes.get(nomes.size() - 1 - i);
        }
        
        System.out.println("\nNomes na ordem inversa:");
        for (String nome : nomesInverso) {
            System.out.println(nome);
        }
        
        scan.close();
    }
}
