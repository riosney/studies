package com.riosney.estruturadados.pesquisas.ordenacao.bubbleSort;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//int opcao = Integer.parseInt(args[1]);
		/*
		int vetor[] = new int[Integer.parseInt(args[0])];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}*/
		
		AlgoritmoOrdenacao alg = new AlgoritmoOrdenacao();
		//alg.setVetor(vetor);		
		//alg.bubbleSort();	
		//alg.selectionSort();
		//alg.insertionSort();
		alg.quickSort(0, alg.getVetor().length-1);
		alg.mostraVetor();
		
		/* bubblesort
		AlgoritmoOrdenacao alg = new AlgoritmoOrdenacao();		
		alg.bubbleSort();	
		alg.mostraVetor();
		*/
	}

}
