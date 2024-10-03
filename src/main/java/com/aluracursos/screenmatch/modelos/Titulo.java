package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.exceptions.ErrorEnConvertirDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nombreTitulo;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluacionesUsuario;
    public Titulo(String nombreTitulo, int fechaDeLanzamiento) {
        this.nombreTitulo = nombreTitulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombreTitulo = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")) {

            throw new ErrorEnConvertirDuracionException("No se puede convertir la duracion pro que contiene N/A");
        }

        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0, 3).replace(" ", ""));
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getTotalDeEvaluacionesUsuario() {
        return totalDeEvaluacionesUsuario;
    }

    public void muestraFichaTecnica() {
        System.out.println("Titulo:  " + nombreTitulo);
        System.out.println("Año de lanzamiento : " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evaluacionUsuario(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluacionesUsuario++;
    }

    public double calculaMedia() {
        return (sumaDeLasEvaluaciones / totalDeEvaluacionesUsuario);
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.nombreTitulo.compareTo(otroTitulo.getNombreTitulo());
    }

    @Override
    public String toString() {
        return ("nombreTitulo='" + nombreTitulo +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion= " + duracionEnMinutos +")");
    }
}
