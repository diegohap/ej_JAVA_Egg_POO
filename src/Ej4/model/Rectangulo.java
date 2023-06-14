package Ej4.model;

public class Rectangulo {
    private Double base;
    private Double height;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double perimeter(){
        return this.base*2 + this.height*2;
    }

    public Double surface(){
        return this.base*this.height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
