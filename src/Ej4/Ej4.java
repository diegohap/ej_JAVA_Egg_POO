package Ej4;

import Ej3.model.Operacion;
import Ej4.model.Rectangulo;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("ingrese base y altura de un rectangulo");
        rectangulo.setBase(teclado.nextDouble());
        rectangulo.setHeight(teclado.nextDouble());

        System.out.println("Perimetro= " + rectangulo.perimeter());
        System.out.println("Superficie= " + rectangulo.surface());
    }
}
