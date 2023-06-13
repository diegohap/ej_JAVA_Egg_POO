package Ej1;

import Ej1.model.Libro;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("ingrese el ISBN del libro");
        libro.setIsbn(teclado.nextInt());

        System.out.println("ingrese nombre del libro");
        libro.setTitle(teclado.nextLine());

        System.out.println("ingrese nombre del autor");
        libro.setAuthor(teclado.nextLine());

        System.out.println("ingrese la cantidad de paginas");
        libro.setNumPages(teclado.nextInt());

        System.out.println(libro.toString());

    }
}