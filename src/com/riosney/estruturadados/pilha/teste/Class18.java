package com.riosney.estruturadados.pilha.teste;

import java.util.Stack;

import com.riosney.estruturadados.pilha.Pilha;

public class Class18 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
	}

}
