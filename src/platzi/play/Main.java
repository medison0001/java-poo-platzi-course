package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PLATZI PLAY 🍿");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "El señor de los anillos";
        pelicula.fechaEstreno = LocalDate.of(2018,10, 15);
        pelicula.genero = "Fantasía";
        pelicula.calificar(4.7);
        pelicula.duracion = 120;

        long duracionLong = pelicula.duracion;
        int calificacionInt = (int) pelicula.calificacion;
        int numeroDePremios = (int) Long.parseLong("25000000000");

        System.out.println("Duracion Long: " + duracionLong);
        System.out.println("Calificacion Int: " + calificacionInt);
        System.out.println("Numero de premios: " + numeroDePremios);

        Usuario usuario = new Usuario();
        usuario.nombre = "Juan";
        usuario.fechaRegistro = LocalDateTime.of(2025, 12, 24, 17, 15, 14);

        System.out.println(usuario.fechaRegistro);

        usuario.ver(pelicula);

    }
}