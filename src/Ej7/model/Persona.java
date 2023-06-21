package Ej7.model;

public class Persona {
    public String nombre;
    public String apellido;
    public Integer edad;
    public String sexo;
    public Double peso;
    public Double altura;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void crearPersona(String nombre, String apellido, Integer edad, String sexo, Double peso, Double altura) throws Exception{
        if(sexo.equals("O")  || sexo.equals("o")  || sexo.equals("H")  || sexo.equals("h")  || sexo.equals("M")  || sexo.equals("m")) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }
        else
            throw new Exception("valor de atributo 'sexo' incorrecto");
    }

    public Integer calcularIMC(){
        Double imc = this.peso/(Math.pow(this.altura, 2));
        if(imc < 20)
            return -1;
        else if(imc < 25)
            return 0;
        return 1;
    }

    public Boolean esMayorDeEdad(){
        return this.edad>18;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
