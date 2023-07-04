package Ej12;

import Ej12.model.Persona;

import java.time.LocalDate;

public class Ej12 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.crearPersona("Tito", LocalDate.of(1985, 5, 17));
        System.out.println("edad: " + persona.calcularAniosEdad());
        System.out.println(persona.esMenorQue(13));
        System.out.println(persona.toString());
    }
}
