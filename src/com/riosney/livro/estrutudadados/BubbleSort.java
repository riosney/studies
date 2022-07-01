package com.riosney.livro.estrutudadados;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int x[] = new int[5];
		int n, i, aux, troca;
		
		Scanner entrada = new Scanner(System.in);
		
		// carregando os números do vetor
		for(i=0; i<=4; i++) {
			System.out.println("Digite o "+(i+1)+ "º número: ");
			x[i] = entrada.nextInt();
		}
		
		// ordenando de forma decrescente
		// laço com a quantidade de elementos do vetor
		// e enquanto houver troca
		n = 1;
		troca = 1;
		while(n <= 5 && troca == 1) {
			troca = 0;
			for(i=0; i<=3; i++) {
				if(x[i] < x[i+1]) {
					troca = 1;
					aux = x[i];
					x[i] = x[i+1];
					x[i+1] = aux;
				}
			}
			n = n + 1;
		}
		
		// mostrando o vetor ordenado
		for(i=0; i<4;i++) {
			System.out.println((i+1)+"º número: "+x[i]);
		}
		
	}

}
