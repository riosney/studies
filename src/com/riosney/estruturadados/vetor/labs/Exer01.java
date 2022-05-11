package com.riosney.estruturadados.vetor.labs;

import com.riosney.estruturadados.vetor.Lista;

public class Exer01 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("C"));
		
	}

}
