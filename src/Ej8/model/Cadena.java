package Ej8.model;
public class Cadena implements Comparable<String>{
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
    public Integer mostrarVocales(){
        return frase.length() - frase.replaceAll("[aeiouAEIOU]","").length();
    }
    public String invertirFrase(){
        return new StringBuilder(this.frase).reverse().toString();
    }
//    public Integer vecesRepetido(String letra){
//        return Long.valueOf(frase.chars()
//                                 .mapToObj(Character::toString)
//                                 .filter(c -> c.equalsIgnoreCase(letra))
//                                 .count()
//                           ).intValue();
//    }
    public Integer vecesRepetido(String letra){
        return frase.length() - frase.replaceAll(letra,"").length();
    }
    public String unirFrase(String frase){
        return this.frase + frase;
    }
    public String reemplazar(String oldL, String newL){
        return frase.replaceAll(oldL, newL);
    }
    public Boolean contiene(String letra){
        return frase.contains(letra);
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
    @Override
    public int compareTo(String o) {
        return Integer.compare(frase.length(), o.length());
    }
}