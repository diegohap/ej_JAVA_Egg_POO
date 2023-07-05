package EjGrupal3.model;

public class Pelicula {
    private String titulo;
    private String genero;
    private Integer anio;
    private Integer duracionMinutos;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, Integer anio, Integer duracionMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
}