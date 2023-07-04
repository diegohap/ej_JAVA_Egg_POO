package Ej14.model;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mobil {
    private String brand;
    private Double price;
    private String model;
    private Double ramInGB;
    private Double storageInGB;
    private Integer[] code = new Integer[7];
    private Scanner teclado = new Scanner(System.in);

    public Mobil() {
    }

    public Mobil(String brand, Double price, String model, Double ramInGB, Double storageInGB, Integer[] code) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.ramInGB = ramInGB;
        this.storageInGB = storageInGB;
        this.code = code;
    }

    public void cargarDatosCelular(){
        System.out.println("ingrese la marca del movil");
        this.brand = teclado.nextLine();
        System.out.println("ingrese el modelo del movil");
        this.model = teclado.nextLine();
        System.out.println("ingerse el precio en $");
        this.price = teclado.nextDouble();
        System.out.println("ingrese la cantidad de memoria RAM en GB");
        this.ramInGB = teclado.nextDouble();
        System.out.println("ingrese la cantidad de almacenamiento en GB");
        this.storageInGB = teclado.nextDouble();
        ingresarCodigo();
    }

    public void ingresarCodigo(){
        System.out.println("ingrese el codigo de 7 dígitos");
        Long codigo = teclado.nextLong();
        String charCode =  codigo.toString().substring(0, code.length);
        for (int i = 0; i < code.length; i++) {
            code[i] = Character.getNumericValue(charCode.charAt(i));
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getRamInGB() {
        return ramInGB;
    }

    public void setRamInGB(Double ramInGB) {
        this.ramInGB = ramInGB;
    }

    public Double getStorageInGB() {
        return storageInGB;
    }

    public void setStorageInGB(Double storageInGB) {
        this.storageInGB = storageInGB;
    }

    public Integer[] getCode() {
        return code;
    }

    public void setCode(Integer[] code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", ramInGB=" + ramInGB +
                ", storageInGB=" + storageInGB +
                ", code=" +
                Arrays.stream(code)
                        .map(String::valueOf)
                        .collect(Collectors.joining("")) +
                '}';
    }
}