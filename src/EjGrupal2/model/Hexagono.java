package EjGrupal2.model;

public class Hexagono extends Figura {
    private Double lado;
    private Double apotema;

    public Hexagono(Double lado) {
        this.lado = lado;
        this.apotema = Math.sqrt(Math.pow(this.lado, 2) - Math.pow(this.lado, 2)/2);
    }
    @Override
    public Double getArea(){
        return this.lado * this.apotema /2;
    }
    @Override
    public Double getPerimetro(){
        return this.lado*6;
    }
}
