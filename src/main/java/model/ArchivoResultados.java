package model;

import com.opencsv.bean.CsvBindByPosition;

public class ArchivoResultados {
    @CsvBindByPosition(position = 0)
    private Integer equipo1_id;
    @CsvBindByPosition(position = 1)
    private String equipo1_nombre;
    @CsvBindByPosition(position = 2)
    private String equipo1_descripcion;
    @CsvBindByPosition(position = 3)
    private Integer equipo1_cantidad_goles;
    @CsvBindByPosition(position = 4)
    private Integer equipo2_cantidad_goles;
    @CsvBindByPosition(position = 5)
    private Integer equipo2_id;
    @CsvBindByPosition(position = 6)
    private String equipo2_nombre;
    @CsvBindByPosition(position = 7)
    private String equipo2_descripcion;

    public Integer get_equipo1_id() {
        return equipo1_id;
    }

    public void set_equipo1_id(Integer equipo1_id) {
        this.equipo1_id = equipo1_id;
    }

    public String get_equipo1_nombre() {
        return equipo1_nombre;
    }

    public void set_equipo1_nombre(String equipo1_nombre) {
        this.equipo1_nombre = equipo1_nombre;
    }

    public String get_equipo1_descripcion() {
        return equipo1_descripcion;
    }

    public void set_equipo1_descripcion(String equipo1_descripcion) {
        this.equipo1_descripcion = equipo1_descripcion;
    }

    public Integer get_equipo1_cantidad_goles() {
        return equipo1_cantidad_goles;
    }

    public void set_equipo1_cantidad_goles(Integer equipo1_cantidad_goles) {
        this.equipo1_cantidad_goles = equipo1_cantidad_goles;
    }

    public Integer get_equipo2_cantidad_goles() {
        return equipo2_cantidad_goles;
    }

    public void set_equipo2_cantidad_goles(Integer equipo2_cantidad_goles) {
        this.equipo2_cantidad_goles = equipo2_cantidad_goles;
    }

    public Integer get_equipo2_id() {
        return equipo2_id;
    }

    public void set_equipo2_id(Integer equipo2_id) {
        this.equipo2_id = equipo2_id;
    }

    public String get_equipo2_nombre() {
        return equipo2_nombre;
    }

    public void set_equipo2_nombre(String equipo2_nombre) {
        this.equipo2_nombre = equipo2_nombre;
    }

    public String get_equipo2_descripcion() {
        return equipo2_descripcion;
    }

    public void set_equipo2_descripcion(String equipo2_descripcion) {
        this.equipo2_descripcion = equipo2_descripcion;
    }