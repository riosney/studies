package com.riosney.estruturadados.pesquisas.listaEncadeada.ex01;

public class Conversor {

	public static void main(String args[]) {
		int numero = Integer.parseInt(args[0]);

		int resto;
		IPilha p;
		try {
			p = (IPilha) Class.forName(args[1]).newInstance();
			while (numero != 0) {
				resto = numero % 2;
				p.push(resto);
				numero = numero / 2;
			}

			while (!p.isEmpty()) {
				resto = p.pop();
				System.out.print(resto);
			}
			System.out.println("\nfim do programa");
			
		} catch (Exception ex) {
			System.err.println("Deu muito ruim...");
		}
	}

}
