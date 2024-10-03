package com.aluracursos.screenmatch.exceptions;

public class ErrorEnConvertirDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorEnConvertirDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}

