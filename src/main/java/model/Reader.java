package model;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

	String filePath;
	List<ArchivoResultados> lineasArchivo;

	public Reader(String path) {
		this.filePath = path;
		this.lineasArchivo = new ArrayList<>();
	}

	public void parsearArchivo() {
		List<ArchivoResultados> listaDeResultados = null;
		try {
			listaDeResultados = new CsvToBeanBuilder(new FileReader(this.filePath))
			.withSkipLines(1)
			.withSeparator(';')
			.withType(ArchivoResultados.class)
			.build()
			.parse();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.lineasArchivo = listaDeResultados;
	}

	public ArrayList<Resultados> listarResultados() {
        boolean servicioYaCargado = false;
        ArrayList<ArchivoResultados> resultados = new ArrayList<>();

            for (ArchivoResultados objeto : this.lineasArchivo) {
                servicioYaCargado = false;
                ArchivoResultados nuevoResultado = new ArchivoResultados(objeto.get_equipo1_id(),
                        								


                        								);

                for ( Servicio servicioGuardado : servicios) {
                    if (nuevoServicio.getIdentificadorServicio().equals(servicioGuardado.getIdentificadorServicio())) {
                        servicioYaCargado = true;
                        break;
                    }
                }
                if (!servicioYaCargado) {
                    servicios.add(nuevoServicio);
                }
        }
        return servicios;
	}
}