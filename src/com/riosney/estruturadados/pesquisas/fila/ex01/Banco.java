package com.riosney.estruturadados.pesquisas.fila.ex01;

public class Banco {

	public static void main(String[] args) {

		Fila f = new Fila();
		int e;
		
		f.inserir(176);
		f.inserir(900);
		f.inserir(8015);
		f.inserir(100);
		f.inserir(4587);
		
		while(!f.isEmpty()) {
			e = f.retirar();
			System.out.println("Senha a ser atendida: "+e);
		}
	}

}
