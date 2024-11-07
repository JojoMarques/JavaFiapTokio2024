package java_poo.exercicios.aula06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {

		Collection<Integer> lista = new ArrayList();
		Collection<Integer> listaHash = new HashSet<Integer>();
		Collection<Integer> listaLigada = new LinkedList();
		
		Random random = new Random();
		long inicio = System.currentTimeMillis();
		long fim = 0;
		
		/*for (int i = 0; i < 1000000; i++) {
			lista.add(random.nextInt(0, 10));
			fim = System.currentTimeMillis();
		}
		
		System.out.println("tempo gasto com list:" + (fim - inicio));*/
				
		for (int i = 0; i < 1000000; i++) {
			listaHash.add(random.nextInt(0, 10));
			fim = System.currentTimeMillis();
		}
		
		System.out.println("tempo gasto com set:" + (fim - inicio));
		
		/*for (int i = 0; i < 1000000; i++) {
			listaLigada.add(random.nextInt(0, 10));
			fim = System.currentTimeMillis();
		}
		
		System.out.println("tempo gasto com linked:" + (fim - inicio));*/
	}
	
	/* 50k
	 * arrayList: 5ms
	 * hashSet: 7ms
	 * linkedList: 6ms
	 * 
	/* 100k
	 * arrayList: 8s
	 * hashSet: 9s
	 * linkedList: 6s
	 * 
	 * 1mi
	 * arrayList: 27ms
	 * hashSet: 25ms
	 * linkedList: 142ms
	 * */
	
	// pra poucos registros o linkedlist reforma melhor
}

		/*Random random = new Random();
		long inicio = System.currentTimeMillis();
		
		long tempoGasto1 = preencheLista(lista, random);
		long tempoGasto2 = preencheHash(listaHash, random);
		long tempoGasto3 = preencheListaLigada(listaLigada, random);

		System.out.println("tempo gasto com lista:" + calculaTempo(inicio, tempoGasto1));
		System.out.println("tempo gasto com hashSet:" + calculaTempo(inicio, tempoGasto2));
		System.out.println("tempo gasto com linkedList:" + calculaTempo(inicio, tempoGasto3));

	}

	public static long preencheLista(Collection<Integer> lista, Random random) {
		long fim = 0;
		for (int i = 0; i < 50000; i++) {
			lista.add(random.nextInt(0, 10));
			fim = System.currentTimeMillis();
		}
		return fim;
	}

	public static long preencheHash(Collection<Integer> lista, Random random) {
		long fim = 0;
		for (int i = 0; i < 50000; i++) {
			lista.add(random.nextInt(0, 10));
			fim = System.currentTimeMillis();
		}
		return fim;
	}

	public static long preencheListaLigada(Collection<Integer> lista, Random random) {
		long fim = 0;
		for (int i = 0; i < 50000; i++) {
			lista.add(random.nextInt(0, 10));
			fim = System.currentTimeMillis();
		}
		return fim;
	}

	public static long calculaTempo(long inicio, long fim) {
		return fim - inicio;
	}

}*/
