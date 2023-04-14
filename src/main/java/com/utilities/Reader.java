package com.utilities;

import com.model.Partido;
import com.model.Equipo;
import com.model.EnumResultado;
import com.model.Pronostico;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

	private Path pathResultados;
	private Path pathPronostico;
	private List<Partido> partidos = new ArrayList<>();

	public Reader(Path pathResultados, Path pathPronostico) {
		this.pathResultados = pathResultados;
		this.pathPronostico = pathPronostico;
	}

	public void parsearResultados(ArrayList<Partido> partidos) {
		List<String> lineasResultados = null;

		// manejo el error si no puede leer las lineas del archivo .csv
		try {
			lineasResultados = Files.readAllLines(pathResultados);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		// itero cada linea del archivo y voy creando instancias de partido
		boolean primera = true;
        for (String lineaResultado : lineasResultados) {
            // salteo primera linea
            if (primera) {
                primera = false;
            } else {
                String[] campos = lineaResultado.split(";");
                Equipo equipo1 = new Equipo(campos[1]);
                Equipo equipo2 = new Equipo(campos[6]);
                Partido partido = new Partido(equipo1, equipo2);
                partido.setGolesEq1(Integer.parseInt(campos[3]));
                partido.setGolesEq2(Integer.parseInt(campos[4]));
                partidos.add(partido);
            }
		}
	}

	public int parsearPronostico() {
        int puntos = 0;
        List<String> lineasPronostico = null;

		// manejo el error si no puede leer las lineas del archivo .csv
        try {
            lineasPronostico = Files.readAllLines(pathPronostico);
        } catch (IOException e) {
        	e.printStackTrace();
            System.exit(1);
        }

        boolean primera = true;
        for (String lineaPronostico : lineasPronostico) {
            if (primera) {
                primera = false;
            } else {
                String[] campos = lineaPronostico.split(";");
                Equipo equipo1 = new Equipo(campos[0]);
                Equipo equipo2 = new Equipo(campos[4]);
                Partido partido = null;

                // me fijo q la linea de pronostico q estoy leyendo coincida con la "linea" del partido q ya guarde
                for (Partido partidoSeleccionado : partidos) {
                    if (   partidoSeleccionado.getEquipo1().getNombre().equals(equipo1.getNombre())
                     	&& partidoSeleccionado.getEquipo2().getNombre().equals(equipo2.getNombre())) {
                                        		
                		// si las lineas coinciden determino la prediccion del usuario
                        partido = partidoSeleccionado;
		                Equipo equipo = null;
		                EnumResultado resultado = null;
		                if("X".equals(campos[1])) {
		                    equipo = equipo1;
		                    resultado = EnumResultado.GANADOR;
		                }
		                if("X".equals(campos[2])) {
		                    equipo = equipo1;
		                    resultado = EnumResultado.EMPATE;
		                }
		                if("X".equals(campos[3])) {
		                    equipo = equipo1;
		                    resultado = EnumResultado.PERDEDOR;
		                }
		                
		                // creo la prediccion
		                Pronostico pronostico = new Pronostico(partido, equipo, resultado);
		                // sumar los puntos correspondientes
		                puntos += pronostico.puntos();
	            	}
	            }
            }
        }
        return puntos;
    }
}