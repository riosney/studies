package com.riosney.estruturadados.pilha.teste;

import com.riosney.estruturadados.pilha.Pilha;

public class Class17 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);

		System.out.println(pilha);
		
		System.out.println("Desempilhando elemento " + pilha.desempilha());
		
		System.out.println(pilha);
		
	}

}
