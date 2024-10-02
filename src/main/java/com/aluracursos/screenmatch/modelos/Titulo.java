package com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nombreTitulo;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluacionesUsuario;

    public Titulo(String nombreTitulo, int fechaDeLanzamiento) {
        this.nombreTitulo = nombreTitulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
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
        return "nombreTitulo='" + nombreTitulo + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento;
    }
}
