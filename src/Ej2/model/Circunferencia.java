package Ej2.model;

public class Circunferencia {
    private Double radio;

    public Circunferencia() {
    }

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return Math.PI*Math.pow(this.radio, 2);
    }

    public Double getPerimeter() {
        return 2*Math.PI*this.radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
