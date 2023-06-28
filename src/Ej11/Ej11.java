package Ej11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        // Crear la fecha ingresada por el usuario
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la diferencia de años
        int diferenciaAnios = Period.between(fechaIngresada, fechaActual).getYears();

        // Mostrar la fecha ingresada y la diferencia de años
        System.out.println("Fecha ingresada: " + fechaIngresada);
        System.out.println("Diferencia de años con la fecha actual: " + diferenciaAnios + " años");

    }
}
