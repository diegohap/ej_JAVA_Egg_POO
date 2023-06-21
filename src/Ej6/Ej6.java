package Ej6;

import Ej6.model.Cafeteria;

public class Ej6 {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria(10.0, 5.0);

        System.out.println(cafeteria.getCantidadActual());
        System.out.println(cafeteria.servirTaza(3.0));
        System.out.println(cafeteria.getCantidadActual());
        cafeteria.agregarCafe(4.0);
        System.out.println(cafeteria.getCantidadActual());
        System.out.println(cafeteria.servirTaza(5.0));
        System.out.println(cafeteria.getCantidadActual());
        System.out.println(cafeteria.servirTaza(6.0));
        System.out.println(cafeteria.getCantidadActual());
        cafeteria.llenarCafe();
        System.out.println(cafeteria.getCantidadActual());
        cafeteria.vaciarCafetera();
        System.out.println(cafeteria.getCantidadActual());
    }
}
