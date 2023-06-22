package Ej8.model;

public class Cadena {
    private String frase;
    private Integer longitud;

    public Cadena() {
        this.longitud=0;
    }

    public Cadena(String frase) {
        this.frase = frase;
        if(!frase.isEmpty())
            this.longitud = frase.length();
        else
            this.longitud = 0;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        if(!frase.isEmpty())
            this.longitud = frase.length();
        else
            this.longitud = 0;
    }


}
