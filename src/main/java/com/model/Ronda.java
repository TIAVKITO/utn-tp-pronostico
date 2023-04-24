package com.model;

public class Ronda {
	private String id;
	private String numero;
	// aca hay una cuestion con el array y la coleccion, cual uso?
	private Partido partidos[] = null;

	public Ronda(String numero, Partido partido) {
		this.numero = numero;
		// estara bien?
		this.partidos = partido;
	}

	public String get_numero() {
		return nro;
	}

	public Partido get_partidos() {
		return partidos;
	}
	// pero si es un array de objetos o es una coleccion cambia la cosa no?
	public void set_partidos(Partido partidos) {
		this.partidos = partidos;
	}
	// TODO
	public Integer puntos() {


	}
}