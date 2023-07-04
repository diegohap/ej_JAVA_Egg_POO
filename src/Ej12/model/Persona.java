package Ej12.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona {
    private String name;
    private LocalDate birth;
    private Scanner teclado = new Scanner(System.in);
    public Persona() {
    }

    public Persona(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public void crearPersona(String name, LocalDate birth){
        System.out.println("Ingrese el nombre y luego anio, mes y dia de nacimiento");
        this.name = teclado.nextLine();
        this.birth = LocalDate.of(teclado.nextInt(),
                                  teclado.nextInt(),
                                  teclado.nextInt()
                                 );
    }

    public Integer calcularAniosEdad(){
        return Period.between(birth, LocalDate.now()).getYears();
    }

    public Boolean esMenorQue(Integer aniosEdad){
        return calcularAniosEdad() < aniosEdad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
               ", birth=" + birth;
    }
}
