package Bibleoteca;

public class LibroDigital extends Libro{
    public String formato;
    public double tamanioMB;

    /**
     * Crea un libro digital con su información bibliográfica y de archivo.
     *  título del libro
     * autor del libro
     * año de publicación
     * formato del archivo
     * tamaño del archivo en megabytes
     */
    public LibroDigital(String titulo,String autor,int anio, String formato, double tamanioMB){
        super(titulo, autor, anio);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    /**
     * Muestra en pantalla el título, autor, año, formato y tamaño del libro digital.
     */
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño (MB): " + tamanioMB);
    }
}
