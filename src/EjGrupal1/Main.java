package EjGrupal1;

import EjGrupal1.model.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("Fiat", "Palio", 2015, Vehiculo.AUTOMOVIL);
        Vehiculo moto = new Vehiculo("Guerrero", "XR100", 2016, Vehiculo.MOTOCICLETA);
        Vehiculo bici = new Vehiculo("Carson", "C-111", 2011, Vehiculo.BICICLETA);

        System.out.println("--- AUTOMOVIL ---");
        auto.moverse(5.0);
        System.out.println("d= " + auto.getRecorrido() + "m");

        System.out.println("--- MOTOCICLETA ---");
        moto.moverse(10.0);
        System.out.println("d= " + moto.getRecorrido() + "m");

        System.out.println("--- BICICLETA ---");
        bici.moverse(60.0);
        System.out.println("d= " + bici.getRecorrido() + "m");

        System.out.println("--- Reseteo de recorridos ---");
        auto.resetearRecorrido();
        moto.resetearRecorrido();
        bici.resetearRecorrido();
        System.out.println("--- AUTOMOVIL ---");
        auto.moverse(5*60.0);
        auto.frenar();
        System.out.println("d= " + auto.getRecorrido() + "m");

        System.out.println("--- MOTOCICLETA ---");
        moto.moverse(5*60.0);
        moto.frenar();
        System.out.println("d= " + moto.getRecorrido() + "m");

        System.out.println("--- BICICLETA ---");
        bici.moverse(5*60.0);
        bici.frenar();
        System.out.println("d= " + bici.getRecorrido() + "m");
    }
}
