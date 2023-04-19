import com.model.Partido;
import com.model.Pronostico;
import com.utilities.Reader;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays; 

public class Main {
	public static void main(String[] args) {

	/*
        // check si la ruta es valida
		if(args.length == 0){
            System.out.println("No ingreso ningun archivo como argumento.");
            System.exit(1);
        }

        // paso la ruta 
        Path pathResultados = Paths.get(args[0]);
        Path pathPronostico = Paths.get(args[1]);
    */

        Path pathResultados = Paths.get("C:\\Users\\nicol\\Desktop\\utn-tp-pronostico\\src\\test\\resources\\resultados1.csv");
        Path pathPronostico = Paths.get("C:\\Users\\nicol\\Desktop\\utn-tp-pronostico\\src\\test\\resources\\pronostico1.csv");

        // instancio al lector con las rutas
        Reader lectorArchivos = new Reader(pathResultados, pathPronostico);

        // leo resultados y los guardo en una lista de partidos
        ArrayList<Partido> partidos = new ArrayList<Partido>();
        lectorArchivos.parsearResultados(partidos);
   
    /*
        // me imprime paquete.clase@hashcode pq creo q usa como default toString()
        // pero como hago para leer los datos reales e imprimirlos, tengo q sobreescribir toString()?
        for (Partido objeto : partidos) {
            System.out.println(partidos); 
        }
    */
    
        // leo pronosticos, calculo puntos y los guardo en una variable
        // capaz es mejor leer el pronostico y hacer el calculo de puntos aparte, pensar
        int puntos = lectorArchivos.parsearPronostico(partidos);
        
        // mostrar los puntos
        System.out.println("Los puntos obtenidos por el usuario fueron:");
        System.out.println(puntos);
    
		
	}
}
