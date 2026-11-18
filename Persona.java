package Herencia;

public class Persona {
    public String nombre;

    public int edad;
    public String sexo;

    /**
    crea una persona con sus datos básicos.
    nombre nombre de la persona
    edad de la persona expresada en años
    sexo sexo de la persona
     */
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    /*
    muestra el nombre y la edad de la persona.
    */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}