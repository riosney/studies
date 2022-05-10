package com.riosney.estruturadados.vetor.teste;

import com.riosney.estruturadados.vetor.Lista;

public class Class11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<>(1);
		
		Contato c1 = new Contato("João 1", "1234-9988", "joao1@gmail.com");
		Contato c2 = new Contato("João 2", "7744-9988", "joao2@gmail.com");
		Contato c3 = new Contato("João 3", "1122-9988", "joao3@gmail.com");
		
		vetor.adiciona(c3);
		
	}

}
