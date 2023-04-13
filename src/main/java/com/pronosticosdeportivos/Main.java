package com.pronosticosdeportivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
        // check si la ruta es valida
		if(args.length == 0){
            System.out.println("No ingreso ningun archivo como argumento.");
            System.exit(1);
        }

        // paso la ruta y creo el objeto reader
        Path pathResultados = Paths.get(args[0]);
        Path pathPronostico = Paths.get(args[1]);
        Reader lectorArchivos = new Reader(pathResultados, pathPronostico);

        // leo resultados y los guardo en un List
        List<Partido> partidos = lectorArchivos.parsearResultados();

        lectorArchivos.parsearPronostico();

        // mostrar los puntos
        System.out.println("Los puntos obtenidos por el usuario fueron:");
        System.out.println(puntos);

		
	}
}
