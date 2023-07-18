package EjGrupal4.model;

public class Rutina {
    private Integer id;
    private String nombre;
    private Integer minutos;
    private String nivelDificultad;
    private String descripcion;
    public static final String NIVEL_PRINCIPIANTE = "NIVEL PRINCIPIANTE";
    public static final String NIVEL_INTERMEDIO = "NIVEL INTERMEDIO";
    public static final String NIVEL_AVANZADO = "NIVEL AVANZADO";

    public Rutina() {
    }

    public Rutina(Integer id, String nombre, Integer minutos, String nivelDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.minutos = minutos;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", minutos=" + minutos +
                ", nivelDificultad='" + nivelDificultad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
