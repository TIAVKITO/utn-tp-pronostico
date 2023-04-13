package com.pronosticosdeportivos;

public class Ronda {

	private String nro;
	private List<Partido> partidos = new ArrayList<>();

	public Ronda(String nro, Partido partidos) {
		this.nro = nro;
		this.partidos = partidos;
	}

	public String get_nro() {
		return nro;
	}

	public void set_nro(String nro) {
		this.nro = nro;
	}

	public Partido get_partidos() {
		return partidos;
	}

	public void set_partidos(Partido partidos) {
		this.partidos = partidos;
	}
	// TODO
	public Integer puntos() {


	}
}