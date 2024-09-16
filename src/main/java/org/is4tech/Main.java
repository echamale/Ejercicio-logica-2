package org.is4tech;


import org.is4tech.model.PalabraContada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<PalabraContada> contarPalabras(String oracion) {
        List<PalabraContada> palabras = new ArrayList<>();
        oracion = oracion + " ";

        String palabra = "";

        for (int i = 0; i < oracion.length(); i++) {
            char caracteresPalabra = oracion.charAt(i);

            if(Character.isLetter(caracteresPalabra)) {
                palabra += caracteresPalabra;
            } else if (!palabra.isEmpty()) {
                agregarOActualizarContador(palabras, palabra);
                palabra = "";
            }
        }
        return palabras;
    }

    public static void agregarOActualizarContador(List<PalabraContada> resultado, String palabra) {
        for (PalabraContada palabraContada : resultado) {
            if (palabraContada.getPalabra().equals(palabra)) {
                palabraContada.setCantidad(palabraContada.getCantidad() + 1);
                return;
            }
        }
        resultado.add(new PalabraContada(palabra, 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la oración:");
        String oracion = sc.nextLine();
        sc.close();
        List<PalabraContada> resultado = contarPalabras(oracion);

        for (PalabraContada palabraContada : resultado) {
            System.out.println(palabraContada.toString());
        }
    }
}