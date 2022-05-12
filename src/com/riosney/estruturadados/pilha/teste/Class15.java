package com.riosney.estruturadados.pilha.teste;

import com.riosney.estruturadados.pilha.Pilha;

public class Class15 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia());
		
	}

}
