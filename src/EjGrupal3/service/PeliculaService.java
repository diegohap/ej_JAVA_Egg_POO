package EjGrupal3.service;

import EjGrupal3.model.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PeliculaService {
    List<Pelicula> peliculasList;

    public PeliculaService() {
        peliculasList = new ArrayList<>();
    }

    public PeliculaService(ArrayList<Pelicula> peliculasList) {
        this.peliculasList = peliculasList;
    }

    public Pelicula crearPelicula(String titulo, String genero, Integer anio, Integer duracionMinutos){
        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracionMinutos);
        peliculasList.add(pelicula);
        return pelicula;
    }

    public String listarPeliculasDisponibles(){
        String listaTitulosPeliculas = "";
        for (Pelicula p : peliculasList) {
            listaTitulosPeliculas += p.getTitulo() + "\n";
        }
        return listaTitulosPeliculas;
    }

    public Optional<Pelicula> buscarPeliculaPorTitulo(String titulo){
        Pelicula peliculaBuscada = new Pelicula();
        for (Pelicula p : peliculasList) {
            if (p.getTitulo().toLowerCase().equals(titulo.toLowerCase()))
                return Optional.of(p);
        }
        return Optional.empty();
    }
    public Optional<ArrayList<Pelicula>> buscarPeliculaPorGenero(String genero){
        ArrayList<Pelicula> peliculasBuscadas = new ArrayList<>();
        for (Pelicula p : peliculasList) {
            if (p.getGenero().toLowerCase().equals(genero.toLowerCase()))
                peliculasBuscadas.add(p);
        }
        return Optional.of(peliculasBuscadas);
    }
}