package EjGrupal2.model;

public class Rectangulo extends Figura {
    private Double ladoB;
    private Double ladoH;

    public Rectangulo(Double ladoB, Double ladoH) {
        this.ladoB = ladoB;
        this.ladoH = ladoH;
    }
    @Override
    public Double getArea(){
        return this.ladoB * this.ladoH;
    }
    @Override
    public Double getPerimetro(){
        return this.ladoB*2 + this.ladoH*2;
    }
}
