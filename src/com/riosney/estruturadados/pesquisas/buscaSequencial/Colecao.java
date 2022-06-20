package com.riosney.estruturadados.pesquisas.buscaSequencial;

public class Colecao {
	private int valores[] = { 11, 12, 23, 27, 33, 43, 56, 76, 87, 96 };

	public int buscaSequencial(int val) {
		int iteracoes = 0;
		int pos;
		for (pos = 0; pos < valores.length; pos++) {
			if (val == valores[pos]) {
				System.out.println("Iteracoes = "+iteracoes);
				return pos; 
			}
			iteracoes++;
		}
		System.out.println("Iteracoes = "+iteracoes);
		return -1; 
	}

	public int buscaBinaria(int val) {
		int meio, inicio, fim, iteracoes = 0;
		inicio = 0;
		fim = valores.length - 1;
		while (inicio <= fim) {
			iteracoes++;
			meio = (inicio + fim) / 2;
			if (val == valores[meio]) {
				System.out.println("Iteracoes = "+iteracoes);
				return meio;
			} else {
				if (val > valores[meio]) {
					inicio = meio + 1;
				} else {
					fim = meio - 1;
				}
			}
		}
		System.out.println("Iteracoes = "+iteracoes);
		return -1;
	}
}
