package com.model;

public class Participante {
	private String id;
	private String nombre;

	public Participante(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public String get_id() {
		return id;
	}

	public String get_nombre() {
		return nombre;
	}

	public void set_nombre(String nombre) {
		this.nombre = nombre;
	}
}