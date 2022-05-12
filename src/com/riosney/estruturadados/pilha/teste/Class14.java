package com.riosney.estruturadados.pilha.teste;

import com.riosney.estruturadados.pilha.Pilha;

public class Class14 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		for(int i=1; i<=10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
	}

}
