package Ej7;

import Ej7.model.Persona;

public class Ej7 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        try {
            persona.crearPersona("pepe", "lepu", 23, "u", 90.0, 1.69);
            System.out.println("IMC= " + persona.calcularIMC());
            System.out.println("Mayor de edad: " + persona.esMayorDeEdad());
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            persona.crearPersona("pepe", "lepu", 23, "H", 90.0, 1.69);
            System.out.println("IMC= " + persona.calcularIMC());
            System.out.println("Mayor de edad: " + persona.esMayorDeEdad());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            persona.crearPersona("pepe", "lepu", 23, "H", 60.0, 1.69);
            System.out.println("IMC= " + persona.calcularIMC());
            System.out.println("Mayor de edad: " + persona.esMayorDeEdad());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            persona.crearPersona("pepe", "lepu", 13, "H", 60.0, 1.79);
            System.out.println("IMC= " + persona.calcularIMC());
            System.out.println("Mayor de edad: " + persona.esMayorDeEdad());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
