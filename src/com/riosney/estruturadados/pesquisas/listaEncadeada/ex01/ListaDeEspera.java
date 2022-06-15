package com.riosney.estruturadados.pesquisas.listaEncadeada.ex01;

public class ListaDeEspera {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.inserir(950);
		lista.inserir(123);
		lista.inserir(1022);
		lista.inserir(7);
		
		
		while(!lista.isEmpty()) {
			int e = lista.retirar();
			System.out.println("Retira o elemento: "+e);
		}
		
		//lista.listar();
	}

}
