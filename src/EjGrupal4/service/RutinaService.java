package EjGrupal4.service;

import EjGrupal4.model.Rutina;
import java.util.ArrayList;
import java.util.Optional;

public class RutinaService {
    ArrayList<Rutina> rutinas;

    public RutinaService(ArrayList<Rutina> rutinas) {
        this.rutinas = new ArrayList<>();
    }
    public ArrayList<Rutina> obtenerRutinas(){
        return this.rutinas;
    }
    public Optional<Rutina> obtenerRutinaPorId(Integer id){
//        for (int i = 0; i < clientes.size(); i++) {
//            Rutina c = rutinas.get(i);
//            if(c.getId().equals(id))
//                return Optional.of(c);
//        }
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
            rutinas.set(getIndexRutinaById(id), rutina);
        }
        return obtenerRutinaPorId(id);
    }
    public Optional<Rutina> actualizarRutina(Rutina rutina){
        if(existeRutina(rutina.getId())){
            rutinas.set(getIndexRutinaById(rutina.getId()), rutina);
        }
        return obtenerRutinaPorId(rutina.getId());
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
    private Integer getIndexRutinaById(Integer id){
        for (int i = 0; i < rutinas.size(); i++) {
            if(rutinas.get(i).getId().equals(id))
                return i;
        }
        return 0;
    }
}
