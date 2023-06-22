package EjGrupal2;

import EjGrupal2.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        Figura circulo = new Circulo(3.0);
        Figura cuadrado = new Cuadrado(3.0);
        Figura rectangulo = new Rectangulo(3.0, 4.0);
        Figura triangulo = new Triangulo(3.0, 4.0);
        Figura pentagono = new Pentagono(5.0);
        Figura hexagono = new Hexagono(6.0);
        Figura rombo = new Rombo(5.0, 4.0);

        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(rectangulo);
        figuras.add(triangulo);
        figuras.add(pentagono);
        figuras.add(hexagono);
        figuras.add(rombo);

        for(Figura f: figuras){
            System.out.println(f.getClass());
            System.out.println("Area = " + f.getArea());
            System.out.println("Perimetro = " + f.getPerimetro());
        }
    }
}
