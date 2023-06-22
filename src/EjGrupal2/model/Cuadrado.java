package EjGrupal2.model;

public class Cuadrado extends Figura{
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }
    @Override
    public Double getArea(){
        return Math.pow(this.lado, 2);
    }
    @Override
    public Double getPerimetro(){
        return this.lado*4;
    }
}
