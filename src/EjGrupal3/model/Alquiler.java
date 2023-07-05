package EjGrupal3.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Alquiler {
    private ArrayList<Pelicula> peliculaList;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Alquiler() {
        peliculaList = new ArrayList<Pelicula>();
    }

    public Alquiler(ArrayList<Pelicula> peliculaList, LocalDate fechaInicio, LocalDate fechaFin) {
        this.peliculaList = peliculaList;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public ArrayList<Pelicula> getPeliculaList() {
        return peliculaList;
    }

    public Double calcularCosto(){
        Double total = 10.0;
        Long diasAlquilados = ChronoUnit.DAYS.between(getFechaInicio(), getFechaFin());
        if(diasAlquilados > 3){
            total *= 1+(diasAlquilados-3)*0.1;
        }
        return total;
    }

    public void setPeliculaList(ArrayList<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }

    public void agregarPelicula(Pelicula pelicula){
        if(peliculaList == null)
            peliculaList = new ArrayList<Pelicula>();
        this.peliculaList.add(pelicula);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {

        return "Alquiler{" +
                ", peliculas: " +
                peliculaList.stream()
                        .map(Pelicula::getTitulo)
                        .collect(Collectors.joining("\n")) +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}