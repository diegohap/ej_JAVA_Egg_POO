package Ej3.model;

public class Operacion {
    private Double numA;
    private Double numB;

    public Operacion() {
    }

    public Operacion(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public Double add(){
        return this.numA + this.numB;
    }

    public Double sub(){
        return this.numA - this.numB;
    }

    public Double multiply(){
        return this.numA*this.numB;
    }

    public Double divide() {
        if(!this.numB.equals(0))
            return this.numA / this.numB;
        System.out.println("no se puede dividir por Zero");
        return 0d;
    }
    public Double getNumA() {
        return numA;
    }

    public void setNumA(Double numA) {
        this.numA = numA;
    }

    public Double getNumB() {
        return numB;
    }

    public void setNumB(Double numB) {
        this.numB = numB;
    }
}
