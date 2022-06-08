package com.riosney.estruturadados.pesquisas.hash.ex01;

import java.util.Scanner;

public class InserindoNoHash {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String texto;
		int chave;
		int continua;
		MapaHash mapa = new MapaHash();

		Registro r;
		do {
			System.out.println("Digite uma chave");
			texto = teclado.next();
			chave = Integer.parseInt(texto);
			System.out.println("Digite um valor: ");
			texto = teclado.next();

			r = new Registro(chave, texto);
			mapa.put(r);

			System.out.println("Continua? (1 - sim / 0 - não)");
			continua = Integer.parseInt(teclado.next());

		} while (continua != 0);

		System.out.println("========================================");
		do {
			System.out.println("Digite uma chave");
			chave = Integer.parseInt(teclado.next());
			r = mapa.get(chave);
			if (chave != -1){
				if (r != null) {
					System.out.println("Registro = " + r.getValue());
				} else {
					System.out.println("Nao existe");
				}
			}

		} while (chave != -1);

	}

}
