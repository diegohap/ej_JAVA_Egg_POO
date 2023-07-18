package EjGrupal4.service;

import EjGrupal4.model.Rutina;
import java.util.ArrayList;
import java.util.Optional;

public class RutinaService {
    ArrayList<Rutina> rutinas;

    public RutinaService() {
        this.rutinas = new ArrayList<>();
    }
    public ArrayList<Rutina> obtenerRutinas(){
        return this.rutinas;
    }
    public Optional<Rutina> obtenerRutinaPorId(Integer id){
        for(Rutina r : rutinas) {
            if(r.getId().equals(id))
                return Optional.of(r);
        }
        return Optional.empty();
    }
    public Optional<Rutina> registrarRutina(Integer id, String nombre, Integer minutos, String dificultad, String descripcion){
        if(!existeRutina(id)){
            Rutina rutina = new Rutina(id, nombre, minutos, dificultad, descripcion);
            rutinas.add(rutina);
        }
        else{
            actualizarRutina(id, nombre, minutos, dificultad, descripcion);
        }
        return obtenerRutinaPorId(id);
    }
    public Optional<Rutina> registrarRutina(Rutina rutina){
        if(!existeRutina(rutina.getId())){
            rutinas.add(rutina);
        }
        else{
            actualizarRutina(rutina);
        }
        return obtenerRutinaPorId(rutina.getId());
    }
    public Optional<Rutina> actualizarRutina(Integer id, String nombre, Integer minutos, String dificultad, String descripcion){
        if(existeRutina(id)){
            Rutina rutina = obtenerRutinaPorId(id).get();
            rutina.setNombre(nombre);
            rutina.setMinutos(minutos);
            rutina.setNivelDificultad(dificultad);
            rutina.setDescripcion(descripcion);
            return obtenerRutinaPorId(id);
        }
        return Optional.empty();
    }
    public Optional<Rutina> actualizarRutina(Rutina rutina){
        if(existeRutina(rutina.getId())){
            return actualizarRutina(
                    rutina.getId(),
                    rutina.getNombre(),
                    rutina.getMinutos(),
                    rutina.getNivelDificultad(),
                    rutina.getDescripcion());
        }
        return Optional.empty();
    }
    public void eliminarRutina(Integer id){
        if(existeRutina(id))
            rutinas.remove(obtenerRutinaPorId(id).get());
    }
    private Boolean existeRutina(Integer id){
        for (Rutina r : rutinas) {
            if(r.getId().equals(id))
                return true;
        }
        return false;
    }
}
