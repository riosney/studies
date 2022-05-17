package com.riosney.estruturadados.pilha.labs;

import java.util.Scanner;

import com.riosney.estruturadados.pilha.Pilha;

public class Exer01 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			System.out.println("Digite o n�mero: ");
			int num = scan.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("Empilhado " + num);
				pilha.empilha(num);
			}else {
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha vazia");
				} else {
					System.out.println("N�mero �mpar desempilha: " + desempilhado);
				}
			}
		}
		
		System.out.println("N�meros lidos, desempilhando");
		
		while(!pilha.estaVazia()) {
			System.out.println("N�mero �mpar desempilha: " + pilha.desempilha());
		}
		
		System.out.println("Todos os elementos foram desempilhados");
		
	}

}
