package Ej13;

import Ej13.model.Curso;

public class Ej13 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        try {
            curso.crearCurso();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Descripcion del curso: " + curso.toString());
        System.out.println("ganancia del curso= $" + curso.calcularGanancias());
    }
}
