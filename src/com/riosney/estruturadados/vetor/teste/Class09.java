package com.riosney.estruturadados.vetor.teste;

import com.riosney.estruturadados.vetor.Vetor;

public class Class09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor + "\n");
		
		System.out.println("Remover o elemento F");
		int pos = vetor.busca("F");
		if(pos > -1) {
			vetor.remove(pos);
			System.out.println(vetor);
		} else {
			System.out.println("Elemento n�o existe no vetor");
		}
		
	}

}
