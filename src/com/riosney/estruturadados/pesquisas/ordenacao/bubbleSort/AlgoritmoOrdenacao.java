package com.riosney.estruturadados.pesquisas.ordenacao.bubbleSort;

public class AlgoritmoOrdenacao {

	private int vetor[] = {25, 57, 48, 37, 12, 92, 33};
	
	public void setVetor(int vetor[]) {
		this.vetor = vetor;
	}
	
	public void bubbleSort() {
		int it;
		int pos;
		int temp;
		
		for(it=0; it < vetor.length-1; it++) {
			for(pos = 0; pos < vetor.length -  it-1; pos++) {
				if(vetor[pos] > vetor[pos+1]) {
					temp = vetor[pos];
					vetor[pos] = vetor[pos+1];
					vetor[pos+1] = temp;
				}
			}
			
		}
	}
	
	public void selectionSort() {
		int it, posMenor, posMenorInicial, i, temp;
		
		for(it = 0; it < vetor.length-1; it++) {
			posMenorInicial = it;
			posMenor = it+1;
			for(i = posMenorInicial +1; i<vetor.length; i++) {
				if(vetor[i] < vetor[posMenor]) {
					posMenor = i;
				}								
			}
			
			if(vetor[posMenor] < vetor[posMenorInicial]) {
				// troca
				temp = vetor[posMenorInicial];
				vetor[posMenorInicial] = vetor[posMenor];
				vetor[posMenor] = temp;
			}
			
			//System.out.println("Iteracao "+it);
			//mostraVetor();
		}
	}
	
	public void insertionSort() {
		int carta, it, j;
		for(it = 1; it < vetor.length; it++) {
			carta = vetor[it];
			for(j = it-1; (j>=0) && vetor[j] > carta; j--) {
				vetor[j+1] = vetor[j];
			}
			vetor[j+1] = carta;
			System.out.println("----Iteração "+it);
			mostraVetor();
		}
	}
	
	public void mostraVetor() {
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println("");
	}
	
}
