package EjGrupal2.model;

public class Pentagono extends Figura {
    private Double lado;
    private Double apotema;

    public Pentagono(Double lado) {
        this.lado = lado;
        this.apotema = this.lado/2*Math.sqrt(1+2/Math.sqrt(5));
    }
    @Override
    public Double getArea(){
        return ((lado*5)*apotema)/2;
    }
    @Override
    public Double getPerimetro(){
        return this.lado*5;
    }
}
