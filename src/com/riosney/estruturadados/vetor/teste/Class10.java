package com.riosney.estruturadados.vetor.teste;

import com.riosney.estruturadados.vetor.VetorObjetos;

public class Class10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("João 1", "1234-9988", "joao1@gmail.com");
		Contato c2 = new Contato("João 2", "7744-9988", "joao2@gmail.com");
		Contato c3 = new Contato("João 3", "1122-9988", "joao3@gmail.com");
		
		Contato c4 = new Contato("João 1", "1234-9988", "joao1@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}

}
