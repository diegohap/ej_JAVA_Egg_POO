package Ej3;

import Ej3.model.Operacion;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operacion operacion = new Operacion();

        System.out.println("ingrese dos numeros");
        operacion.setNumA(teclado.nextDouble());
        operacion.setNumB(teclado.nextDouble());

        System.out.println("Suma= " + operacion.add());
        System.out.println("Resta= " + operacion.sub());
        System.out.println("Mult= " + operacion.multiply());
        System.out.println("Div= " + operacion.divide());

    }
}
