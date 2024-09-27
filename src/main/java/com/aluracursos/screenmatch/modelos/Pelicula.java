package com.aluracursos.screenmatch.modelos;

import punto.alura.cursos.screen.match.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    String director;

   public Pelicula(String nombreTitulo, int fechaDeLanzamiento) {
        super(nombreTitulo, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);}

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombreTitulo() + " (" + getFechaDeLanzamiento() + ")";
    }

}
