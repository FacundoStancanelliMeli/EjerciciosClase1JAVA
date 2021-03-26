package com.saludo.test.Dominio;

import java.util.Hashtable;

public class DevolverPalabra {
    public static String devolverPalabraConvertida(Hashtable<String, String> hashtable, String fraseEnCodigoMorse){
        String letrasEnMorse = "";
        String letrasEnEspaniol = "";
        fraseEnCodigoMorse = fraseEnCodigoMorse.replace("   ", " / ");
        for (int i = 0; i < fraseEnCodigoMorse.length(); i++) {

            if (fraseEnCodigoMorse.charAt(i) == '/'){
                letrasEnEspaniol+= " ";
            }
            else{
                if (fraseEnCodigoMorse.charAt(i) == ' ' || fraseEnCodigoMorse.charAt(i) == '/'){
                    letrasEnEspaniol += hashtable.get(letrasEnMorse);
                    letrasEnMorse = "";
                }
                else{
                    letrasEnMorse+=fraseEnCodigoMorse.charAt(i);
                }
            }

        }

        letrasEnEspaniol += hashtable.get(letrasEnMorse);

        return letrasEnEspaniol;
    }
}
