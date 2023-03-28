package com.pronosticosdeportivos;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import model.ArchivoPronosticos;
import model.ArchivoResultados;

public class Main {
	public static void main(String[] args) {
	
		if(args.length == 0){
            System.out.println("ERROR: No ingresaste ningún archivo como argumento!");
            System.exit(88);
        }

        Reader lectorArchivos = new Reader(args[0]);
	
        List<ArchivoResultados> resultados = lectorArchivos.parsearArchivo();

        for (ArchivoResultados e : resultados) {
            System.out.println(e);
        }
		
	}
}