package Ej8;

import Ej8.model.Cadena;

public class Ej8 {
    public static void main(String[] args) {
        Cadena cadena = new Cadena("casa blanca");
        System.out.println(cadena.mostrarVocales());
        System.out.println(cadena.invertirFrase());
        System.out.println("El caracter 'a' se repite " + cadena.vecesRepetido("a") + " veces");
        System.out.println(cadena.compareTo("la casona del molino"));
        System.out.println(cadena.unirFrase("-la casona del molino"));
        System.out.println(cadena.reemplazar("a", "A"));
        System.out.println(cadena.contiene("c"));
    }
}
