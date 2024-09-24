import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import punto.alura.cursos.screen.match.calculos.CalculadoraDeTiempo;
import punto.alura.cursos.screen.match.calculos.FiltroRecomendacion;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombreTitulo("Virgen a los 40");
        miPelicula.setFechaDeLanzamiento(2005);
        miPelicula.setDuracionEnMinutos(133);
        miPelicula.setIncluidoEnPlan(true);



        miPelicula.muestraFichaTecnica();
        miPelicula.evaluacionUsuario(10);
        miPelicula.evaluacionUsuario(10);
        miPelicula.evaluacionUsuario(7.8);
        System.out.println(miPelicula.getTotalDeEvaluacionesUsuario());
        System.out.println("El promedio de la pelicula es: " + miPelicula.calculaMedia());


        Serie casaDragon = new Serie();
        casaDragon.setNombreTitulo("La Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otrPelicula = new Pelicula();
        otrPelicula.setNombreTitulo("Matrix");
        otrPelicula.setFechaDeLanzamiento(1999);
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



    }
}


