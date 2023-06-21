package Ej6.model;

public class Cafeteria {
    private Double capacidadMaxima;
    private Double cantidadActual;

    public Cafeteria() {
    }

    public Cafeteria(Double capacidadMaxima, Double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void llenarCafe(){
        this.cantidadActual = this.capacidadMaxima;
    }

    public Double servirTaza(Double tamañoTaza){
        Double servido = this.cantidadActual - tamañoTaza;
        if(servido < 0){
            this.cantidadActual = 0.0;
            return -servido;
        }
        this.cantidadActual -= tamañoTaza;
        return tamañoTaza;
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0.0;
    }

    public void agregarCafe(Double cantCafe){
        this.cantidadActual += cantCafe;
        if(this.cantidadActual > this.capacidadMaxima)
            this.cantidadActual = this.capacidadMaxima;
    }

    public void setCapacidadMaxima(Double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
