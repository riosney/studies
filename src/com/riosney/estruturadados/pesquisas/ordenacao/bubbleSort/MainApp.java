package com.riosney.estruturadados.pesquisas.ordenacao.bubbleSort;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		/*
		int vetor[] = new int[Integer.parseInt(args[0])];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}*/
		
		AlgoritmoOrdenacao alg = new AlgoritmoOrdenacao();
		//alg.setVetor(vetor);		
		//alg.bubbleSort();	
		alg.selectionSort();
		alg.mostraVetor();
		
		/* bubblesort
		AlgoritmoOrdenacao alg = new AlgoritmoOrdenacao();		
		alg.bubbleSort();	
		alg.mostraVetor();
		*/
	}

}
