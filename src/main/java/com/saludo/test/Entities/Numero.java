package com.saludo.test.Entities;

import com.saludo.test.Dominio.ConvertirNumeroARomano;

public class Numero {
    private final int valorEnDecimal;
    private String valorEnRomano;

    public Numero(int valorEnDecimal) {
        this.valorEnDecimal = valorEnDecimal;
    }

    public void convertirNumeroARomano(){
        this.valorEnRomano = ConvertirNumeroARomano.convertirNumeroARomano(this.valorEnDecimal);

    }

    public String mostrarNumeroRomano(){
        return "El numero romano del numero " + this.valorEnDecimal + " es: " + this.valorEnRomano;
    }
}
