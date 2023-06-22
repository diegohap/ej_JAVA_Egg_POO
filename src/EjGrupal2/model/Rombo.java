package EjGrupal2.model;

public class Rombo extends Figura {
    private Double diagB;
    private Double diagH;

    public Rombo(Double diagB, Double diagH) {
        this.diagB = diagB;
        this.diagH = diagH;
    }
    @Override
    public Double getArea(){
        return this.diagB*this.diagH/2;
    }
    @Override
    public Double getPerimetro(){
        return 2*Math.sqrt(Math.pow(this.diagH,2) + Math.pow(this.diagB,2));
    }
}
