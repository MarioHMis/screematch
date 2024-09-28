package principal;

import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import punto.alura.cursos.screen.match.calculos.CalculadoraDeTiempo;
import punto.alura.cursos.screen.match.calculos.FiltroRecomendacion;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Virgen a los 40", 2005);
        miPelicula.setDuracionEnMinutos(133);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());


        miPelicula.muestraFichaTecnica();
        miPelicula.evaluacionUsuario(10);
        miPelicula.evaluacionUsuario(10);
        miPelicula.evaluacionUsuario(7.8);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluacionesUsuario());
        System.out.println("El promedio de la pelicula es: " + miPelicula.calculaMedia());


        Serie casaDragon = new Serie("La Casa del Dragon", 2022);
        casaDragon.muestraFichaTecnica();
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otrPelicula = new Pelicula("Matrix", 1999);
        otrPelicula.setDuracionEnMinutos(136);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otrPelicula);
        System.out.println("Tiempo requerido para ver tus titulos favoritos " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumeroEpisodio(1);
        episodio.setNombreEpisodio("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeMario = new Pelicula("Deadpool", 2001);
        peliculaDeMario.setDuracionEnMinutos(180);
        peliculaDeMario.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeMario);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otrPelicula);


        System.out.println("Tamaño de la lista de peliculas: " + listaDePeliculas.size());
        System.out.println("La primer pelicual es: " + listaDePeliculas.get(0).getNombreTitulo());
        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());


    }
}


