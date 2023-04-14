import com.model.Partido;
import com.utilities.Reader;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	
        // check si la ruta es valida
		if(args.length == 0){
            System.out.println("No ingreso ningun archivo como argumento.");
            System.exit(1);
        }

        // paso la ruta y creo el lector 
        Path pathResultados = Paths.get(args[0]);
        Path pathPronostico = Paths.get(args[1]);
        Reader lectorArchivos = new Reader(pathResultados, pathPronostico);

        // leo resultados y los guardo en una lista de partidos
        ArrayList<Partido> partidos = new ArrayList<Partido>();
        lectorArchivos.parsearResultados(partidos);

        // leo pronosticos y calculo resultados
        lectorArchivos.parsearPronostico();

        // mostrar los puntos
        System.out.println("Los puntos obtenidos por el usuario fueron:");
        // ERROR NUNCA DECLARE puntos
        //System.out.println(puntos);

		
	}
}
