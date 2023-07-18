package EjGrupal4.model;

public class Cliente {
    private Integer id;
    private String nombre;
    private Integer edad;
    private Double altura;
    private Double peso;
    private String objetivo;

    public Cliente() {
    }
    public Cliente(Integer id, String nombre, Integer edad, Double altura, Double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
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
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", objetivo='" + objetivo + '\'' +
                '}';
    }
}