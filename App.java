package Bibleoteca;

public class App {
    /**
     * Crea un libro y un libro digital, y muestra su información.
     * argumentos recibidos por el programa
     */
    public static void main(String[] args) {
        Libro libro = new Libro("lo que callamos los alumnos", "leo linares", 1900);
        LibroDigital libroDigital = new LibroDigital("lo que callamos los alumnos", "leo linares", 1900, "PDF", 5.2);
        libro.mostrarInformacion();
        libroDigital.mostrarInformacion();
    }
}