package com.saludo.test.Dominio;

import java.util.Hashtable;

public class DevolverEquivalencias {
    public static Hashtable<String, String> obtenerEquivalencias() {
        Hashtable<String, String> equivalencias = new Hashtable<>();
        equivalencias.put(".-", "A");
        equivalencias.put("-...", "B");
        equivalencias.put("-.-.", "C");
        equivalencias.put("----", "CH");
        equivalencias.put("-..", "D");
        equivalencias.put(".", "E");
        equivalencias.put("..-.", "F");
        equivalencias.put("--.", "G");
        equivalencias.put("....", "H");
        equivalencias.put("..", "I");
        equivalencias.put(".---", "J");
        equivalencias.put("-.-", "K");
        equivalencias.put(".-..", "L");
        equivalencias.put("--", "M");
        equivalencias.put("-.", "N");
        equivalencias.put("--.--", "Ñ");
        equivalencias.put("---", "O");
        equivalencias.put(".--.", "P");
        equivalencias.put("--.-", "Q");
        equivalencias.put(".-.", "R");
        equivalencias.put("...", "S");
        equivalencias.put("-", "T");
        equivalencias.put("..-", "U");
        equivalencias.put("...-", "V");
        equivalencias.put(".--", "W");
        equivalencias.put("-..-", "X");
        equivalencias.put("-.--", "Y");
        equivalencias.put("--..", "Z");
        equivalencias.put(".....", " ");
        equivalencias.put("/", " ");
        equivalencias.put("", "");
        return equivalencias;
    }
}
