package Herencia;

/**
Representa a un usuario que hereda los datos basicos de la clase persona.
Incluye las credenciales utilizadas para identificar al usuario.
*/
public class Usuario extends Persona{
    public String correo;
    public String contrasena;

    /**
     * Crea un usuario con sus datos personales y credenciales.
     * nombre de la persona
     * edad de la persona expresada en anos
     * sexo de la persona
     * correo electronico del usuario
     * contrasena del usuario
     */
    public Usuario(String nombre, int edad, String sexo, String correo, String contrasena) {
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contrasena = contrasena;
    }

    /**
     * Muestra en pantalla la informacion personal y las credenciales del usuario.
     */
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contrasena);
    }
}