package com.riosney.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Class12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		System.out.println(arrayList);
		
		boolean contem = arrayList.contains("A");
		if(contem) {
			System.out.println("Elemento contém no Array");
		} else {
			System.out.println("Elemento não contém no Array");
		}
		
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento contém no Array na pos " + pos);
		} else {
			System.out.println("Elemento não contém no Array " + pos);
		}
		
		System.out.println(arrayList.get(2) + "\n");
		
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
	}

}
