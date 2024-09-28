package principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Virgen a los 40", 2005);
        miPelicula.evaluacionUsuario(9);
        Pelicula otrPelicula = new Pelicula("Matrix", 1999);
        otrPelicula.evaluacionUsuario(7);
        var peliculaDeMario = new Pelicula("Deadpool", 2001);
        peliculaDeMario.evaluacionUsuario(6);
        Serie casaDragon = new Serie("La Casa del Dragon", 2022);
        casaDragon.evaluacionUsuario(3);

        List<Titulo> list = new LinkedList<>();
        list.add(miPelicula);
        list.add(otrPelicula);
        list.add(peliculaDeMario);
        list.add(casaDragon);

        for (Titulo item : list) {
            System.out.println(item.getNombreTitulo());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3) {
                System.out.println(pelicula.getClasificacion());
            }
        }


        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Steve Carell");
        listaDeArtistas.add("Rayan Gosling");
        listaDeArtistas.add("Sandra Bullock");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista ordenada de artistas es: " + listaDeArtistas);

        Collections.sort(list);
        System.out.println("La lista ordena de pelciulas es: " + list);

        list.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + list);
    }
}
