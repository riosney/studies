package com.riosney.estruturadados.pesquisas.pilha.ex01;

public class Conversor {

	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		Pilha p = new Pilha();
		
		int resto;
		
		while(numero != 0 ) {
			resto = numero % 2;
			p.push(resto);
			numero = numero / 2;
		}
		
		while(!p.isEmpty()) {
			resto = p.pop();
			System.out.println(resto);
		}
		
		System.out.println("Fim");
	}

}
