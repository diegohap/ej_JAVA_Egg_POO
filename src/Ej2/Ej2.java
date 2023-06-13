package Ej2;

import Ej2.model.Circunferencia;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circunferencia circunferencia = new Circunferencia();

        System.out.println("ingrese el radio para una circunferencia");
        circunferencia.setRadio(teclado.nextDouble());

        System.out.println("Area= " + circunferencia.getArea());
        System.out.println("Perimetro= " + circunferencia.getPerimeter());
    }
}
