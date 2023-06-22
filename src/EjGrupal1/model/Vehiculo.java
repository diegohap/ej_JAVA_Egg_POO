package EjGrupal1.model;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;
    private String tipo;
    private Double velocidad;
    private Double recorrido;

    public final static String AUTOMOVIL = "automovil";
    public final static String MOTOCICLETA = "motocicleta";
    public final static String BICICLETA = "bicicleta";

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        ascelerar(this.tipo);
        this.recorrido = 0.0;
    }

    public Double moverse(Double tiempo){
        ascelerar(this.tipo);
        this.recorrido += this.velocidad * tiempo;
        return recorrido;
    }

    public Double frenar(){
        this.velocidad = 0.0;
        this.recorrido += 2.0;
        return recorrido;
    }

    private void ascelerar(String tipo) {
        switch (tipo){
            case AUTOMOVIL -> this.velocidad = 3.0;
            case MOTOCICLETA -> this.velocidad = 2.0;
            case BICICLETA -> this.velocidad = 1.0;
            default -> this.velocidad = 0.0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public Double getRecorrido() {
        return recorrido;
    }

    public void resetearRecorrido() {
        this.recorrido = 0.0;
    }
}
