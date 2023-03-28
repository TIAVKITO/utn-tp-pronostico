package model;

import com.opencsv.bean.CsvBindByPosition;

public class ArchivoPronosticos {
	@CsvBindByPosition(position = 0)
	private Integer equipo1_id;
	@CsvBindByPosition(position = 1)
	private Character gana1;
	@CsvBindByPosition(position = 2)
	private Character empate;
	@CsvBindByPosition(position = 3)
	private Character gana2;
	@CsvBindByPosition(position = 4)
	private Integer equipo2_id;

// esta bien dublicar los getters y setters de equipo1_id y equipo2_id si ya los hice en ArchivoResultados.java??
    public Integer get_equipo1_id() {
        return equipo1_id;
    }

    public void set_equipo1_id(Integer equipo1_id) {
        this.equipo1_id = equipo1_id;
    }

    public Integer get_gana1() {
        return gana1;
    }

    public void set_gana1(Integer gana1){
    	this.gana1 = gana1;
    }

    public Integer get_empate() {
    	return empate;
    }

    public void set_empate(Integer empate) {
    	this.empate = empate;
    }

    public Integer get_gana2() {
        return gana2;
    }

    public void set_gana2(Integer gana2){
    	this.gana2 = gana2;
    }

    public Integer get_equipo2_id() {
        return equipo2_id;
    }

    public void set_equipo2_id(Integer equipo2_id) {
        this.equipo2_id = equipo2_id;
    }
}