package Bibleoteca;

public class Libro {
    public String titulo;
    public String autor;
    public int anio;

    /**
     * Crea un libro con su información básica.
     * título del libro
     * autor del libro
     * año de publicación
     */
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    /**
     * Muestra en pantalla el título, autor y año del libro.
     */
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
    }
}