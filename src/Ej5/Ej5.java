package Ej5;

import Ej5.model.Cuenta;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su DNI");
        Cuenta cuenta = new Cuenta(teclado.nextInt());

        System.out.println(cuenta.consultarDatos());

        System.out.println("Saldo= $" + cuenta.getBalance());

        cuenta.deposit(300d);
        cuenta.withdrawl(150d);
        cuenta.fastWithdrawl(10d);

        System.out.println("Saldo= $" + cuenta.getBalance());
    }
}
