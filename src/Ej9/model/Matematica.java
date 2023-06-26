package Ej9.model;

public class Matematica {
    private Double numA;
    private Double numB;
    public Matematica(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }
    public Double devolverMayor(){
        if(numA > numB)
            return numA;
        return numB;
    }
    public Double devolverMenor(){
        if(numA < numB)
            return numA;
        return numB;
    }
    public Double calcularPotencia(){
        return Math.pow(devolverMayor(), devolverMenor());
    }
    public Double calcularRaiz(){
        return Math.sqrt(Math.abs(devolverMenor()));
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
