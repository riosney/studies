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
	
	public void mostraVetor() {
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println("");
	}
	
}
