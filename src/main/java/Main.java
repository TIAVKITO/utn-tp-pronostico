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

        Path pathResultados = Paths.get("C:\\Users\\nicol\\Desktop\\utn-tp-pronostico\\src\\test\\resources\\resultados2.csv");
        Path pathPronostico = Paths.get("C:\\Users\\nicol\\Desktop\\utn-tp-pronostico\\src\\test\\resources\\pronostico2.csv");

        Reader lectorArchivos = new Reader(pathResultados, pathPronostico);

        ArrayList<Partido> partidos = new ArrayList<Partido>();
        lectorArchivos.parsearResultados(partidos);
   
        ArrayList<Pronostico> pronosticos = new ArrayList<Pronostico>();
        lectorArchivos.parsearPronostico(partidos, pronosticos);

        int puntos = 0;
        for (Partido partido : partidos ) {
            for (Pronostico pronostico : pronosticos) {
                if (partido.get_id().equals(pronostico.get_partido().get_id())) {
                    puntos += pronostico.puntos(partido.resultado(pronostico.get_equipo()));
                }
            }
        }

        System.out.println("Los puntos obtenidos por todos los usuarios son: ");
        System.out.println(puntos/2);	
	}
}
