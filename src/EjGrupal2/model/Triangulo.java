package EjGrupal2.model;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public Double getArea(){
        return this.base * this.altura /2;
    }

    @Override
    public Double getPerimetro(){
        return this.base +
               this.altura +
               Math.sqrt(Math.pow(this.base, 2) +
                                  Math.pow(this.altura,2));
    }
}
