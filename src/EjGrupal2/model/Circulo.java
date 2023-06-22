package EjGrupal2.model;

public class Circulo extends Figura{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }
    @Override
    public Double getArea(){
        return Math.PI*Math.pow(this.radio,2);
    }
    @Override
    public Double getPerimetro(){
        return 2*Math.PI*this.radio;
    }
}
