package EjGrupal3;

import EjGrupal3.model.Pelicula;
import EjGrupal3.service.AlquilerService;
import EjGrupal3.service.PeliculaService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PeliculaService peliculaService = new PeliculaService();
        AlquilerService alquilerService =  new AlquilerService();
        Optional<Pelicula> peliculaBuscada;
        peliculaService.crearPelicula("Titanic", "Drama", 1998, 204);
        peliculaService.crearPelicula("Matrix", "Sci", 1999, 120);
        peliculaService.crearPelicula("El Rey Leon", "Animacion", 1996, 100);
        peliculaService.crearPelicula("Interestelar", "Sci", 2016, 150);
        peliculaService.crearPelicula("El Conjuro 1", "Terror", 2012, 90);

        System.out.println("---   LISTA DE PELICULAS DISPONIBLES PARA ALQUILER   ---");
        System.out.println(peliculaService.listarPeliculasDisponibles());

        System.out.println("---   BUCANDO PELICULA -> TITANIC   ---");
        peliculaBuscada = peliculaService.buscarPeliculaPorTitulo("Titanic");
        if (!peliculaBuscada.isEmpty())
            System.out.println(peliculaBuscada.get().getTitulo());
        else
            System.out.println("pelicula no encontrada");

        System.out.println("---   BUCANDO PELICULAS POR GENERO -> Sci   ---");
        Optional<ArrayList<Pelicula>> peliculasBuscadas = peliculaService.buscarPeliculaPorGenero("Sci");
        if (!peliculaBuscada.isEmpty()) {
            for (Pelicula p : peliculasBuscadas.get())
                System.out.println(p.getTitulo());
        }
        else
            System.out.println("peliculas no encontradas");

        System.out.println("---   CREANDO 3 ALQUILERES Y MOSTRANDOLOS   ---");
        alquilerService.crearAlquiler(
                new ArrayList<>(Arrays.asList(
                        peliculaService.buscarPeliculaPorTitulo("Interestelar").get(),
                        peliculaService.buscarPeliculaPorTitulo("Matrix").get())
                ),
                LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 7, 3)
        );
        alquilerService.crearAlquiler(
                new ArrayList<>(Arrays.asList(
                    peliculaService.buscarPeliculaPorTitulo("Titanic").get(),
                    peliculaService.buscarPeliculaPorTitulo("Matrix").get())
                ),
                LocalDate.of(2023, 7, 2),
                LocalDate.of(2023, 7, 3)
        );
        alquilerService.crearAlquiler(
                new ArrayList<>(Arrays.asList(
                        peliculaService.buscarPeliculaPorTitulo("Interestelar").get(),
                        peliculaService.buscarPeliculaPorTitulo("Matrix").get())
                ),
                LocalDate.of(2023, 7, 1),
                LocalDate.of(2023, 7, 3)
        );

        System.out.println(alquilerService.getAlquilerList());
        System.out.println("---   INGRESOS   ---");
        System.out.println("$" + alquilerService.calcularIngresoTotal());
    }
}