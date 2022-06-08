package com.riosney.estruturadados.pesquisas.hash.ex01;

public class MapaHash {

	private Registro valores[];

	public MapaHash() {
		valores = new Registro[100];
	}

	public void put(Registro registro) {
		int posicao = registro.hashCode();
		if (valores[posicao] == null) {
			valores[posicao] = registro;
		} else {
			Registro reg = valores[posicao];
			if (reg.getKey() == registro.getKey()) {
				reg.setValue(registro.getValue());
				return;
			}
			while (reg.getProximo() != null) {
				if (reg.getKey() == registro.getKey()) {
					reg.setValue(registro.getValue());
					return;
				}
				reg = reg.getProximo();
			}
			
			if (reg.getKey() == registro.getKey()) {
				reg.setValue(registro.getValue());
				return;
			}
			reg.setProximo(registro);
			System.out.println("Novo Registro!");

		}
	}

	public Registro get(int key) {
		Registro r = new Registro();
		r.setKey(key);
		int posicao = r.hashCode();
		Registro resultado = valores[posicao];

		if (resultado != null && resultado.getKey() == key) {
			return resultado;
		} else {
			while (resultado != null) {
				resultado = resultado.getProximo();
				if (resultado != null && resultado.getKey() == key) {
					return resultado;
				}
			}
		}

		return null;
	}

}
