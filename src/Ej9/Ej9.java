package Ej9;

import Ej9.model.Matematica;

public class Ej9 {
    public static void main(String[] args) {
        Matematica mat = new Matematica(3d, 4d);
        System.out.println("Mayor= " + mat.devolverMayor());
        System.out.println("Menor= " + mat.devolverMenor());
        System.out.println("Pow= " + mat.calcularPotencia());
        System.out.println("Raiz del menor= " + mat.calcularRaiz());
    }
}
