package com.riosney.estruturadados.vetor.labs;

import com.riosney.estruturadados.vetor.Lista;

public class Exer04 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");

		System.out.println(lista.busca(0));
		System.out.println(lista.busca(2));

	}

}
