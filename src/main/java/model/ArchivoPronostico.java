package model;

import com.opencsv.bean.CsvBindByPosition;

public class ArchivoPronostico {
	@CsvBindByPosition(position = 0) private Integer equipo1_id;
	@CsvBindByPosition(position = 1) private String gana1;
	@CsvBindByPosition(position = 2) private String empate;
	@CsvBindByPosition(position = 3) private String gana2;
	@CsvBindByPosition(position = 4) private Integer equipo2_id;

	public Integer get_equipo1_id() {
		return equipo1_id;
	}

	public void set_equipo1_id(Integer equipo1_id) {
		this.equipo1_id = equipo1_id;
	}

	public String get_gana1() {
		return gana1;
	}

	public String get_empate() {
		return empate;
	}

	public String get_gana2() {
		return gana2;
	}

	public Integer get_equipo2_id() {
		return equipo2_id;
	}

	public void set_equipo2_id(Integer equipo2_id) {
		this.equipo2_id = equipo2_id;
	}

}