package Ej14;

import Ej14.model.Mobil;

public class Ej14 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.cargarDatosCelular();
        System.out.println(mobil.toString());
    }
}
