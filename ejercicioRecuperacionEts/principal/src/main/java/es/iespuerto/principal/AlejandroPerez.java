package es.iespuerto.principal;

public class AlejandroPerez {

    String nombre;
    String apellido1;
    String apellido2;

    /**
     * Constructor por defecto
     * (Sin valores)
     */
    public AlejandroPerez () {}

    /**
     * Constructor con un parámetro
     * @param nombre de la clase
     */
    public AlejandroPerez(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor con dos parámetros
     * @param nombre de la clase.
     * @param apellido1 de la clase.
     */
    public AlejandroPerez(String nombre,String apellido1) {
        this.nombre = nombre;
        this.apellido1=apellido1;
    }

    /**
     * Constructor de tres prámetros
     * @param nombre de la clase
     * @param apellido1 de la clase
     * @param apellido2 de la clase
     */
    public AlejandroPerez(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     *  Método para validar los atributos de la clase
     * @param nombre del metodo.
     * @param apellido1 del metodo.
     * @param apellido2 del metodo.
     */
    public void validarNombre(String nombre, String apellido1, String apellido2){

    }

}
