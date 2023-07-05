package EjGrupal3.service;

import EjGrupal3.model.Alquiler;
import EjGrupal3.model.Pelicula;
import java.time.LocalDate;
import java.util.ArrayList;

public class AlquilerService {
    ArrayList<Alquiler> alquilerList;

    public AlquilerService() {
        alquilerList = new ArrayList<Alquiler>();
    }

    public AlquilerService(ArrayList<Alquiler> alquilerList) {
        this.alquilerList = alquilerList;
    }

    public Alquiler crearAlquiler(ArrayList<Pelicula> peliculaList, LocalDate fechaInicio, LocalDate fechaFin){
        Alquiler nuevoAlquiler = new Alquiler(peliculaList, fechaInicio, fechaFin);
        alquilerList.add(nuevoAlquiler);
        return nuevoAlquiler;
    }

    public ArrayList<Pelicula> peliculasAlquiladas(){
        ArrayList<Pelicula> peliculasAlquiladas = new ArrayList<Pelicula>();
        for (Alquiler a : alquilerList) {
            for (Pelicula p : a.getPeliculaList()) {
                peliculasAlquiladas.add(p);
            }
        }
        return peliculasAlquiladas;
    }

    public ArrayList<Alquiler> buscarAlquilerPorFechaInicio(LocalDate fechaInicio){
        ArrayList<Alquiler> alquiliresBuscados = new ArrayList<Alquiler>();
        for (Alquiler a : alquilerList) {
            if (a.getFechaInicio().isEqual(fechaInicio))
                alquiliresBuscados.add(a);
        }
        return alquiliresBuscados;
    }

    public Double calcularIngresoTotal(){
        Double total = 0.0;
        for (Alquiler a : alquilerList) {
            total += a.calcularCosto();
        }
        return total;
    }

    public String getAlquilerList() {
        String alquileresString = "";
        for (Alquiler a : alquilerList)
            alquileresString += a.toString() + "\n";
        return alquileresString;
    }
}