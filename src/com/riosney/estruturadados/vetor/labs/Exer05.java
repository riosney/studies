package com.riosney.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.riosney.estruturadados.vetor.Lista;

public class Exer05 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");		
		
		System.out.println(arrayList);
		arrayList.clear();
		System.out.println(arrayList);
		
		Lista<String> lista = new Lista<>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");

		System.out.println(lista);
		lista.limpar();
		System.out.println(lista);
		
	}

}
