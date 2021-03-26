package com.saludo.test.Entities;

import com.saludo.test.Dominio.DevolverEquivalencias;
import com.saludo.test.Dominio.DevolverPalabra;

import java.util.Hashtable;

public class Frase {
    private final String fraseEnCodigoMorse;
    private String fraseEnEspaniol;

    public Frase(String fraseEnCodigoMorse) {
        this.fraseEnCodigoMorse = fraseEnCodigoMorse;
    }

    public void convertirFraseAEspaniol(){
        Hashtable<String, String> hashtable = DevolverEquivalencias.obtenerEquivalencias();
        String palabra;
        palabra = DevolverPalabra.devolverPalabraConvertida(hashtable, this.fraseEnCodigoMorse);
        fraseEnEspaniol = palabra;
    }

    public String mostrarFrase(){
        return this.fraseEnEspaniol;
    }
}
