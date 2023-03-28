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
}