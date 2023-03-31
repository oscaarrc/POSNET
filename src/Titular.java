
/**
 * La clase titular especifica los datos del titular
 * @author Óscar
 */
public class Titular {
    private String dni;
    private String nombre;
    private  String apellido;
    private int telefono;
    private String email;

    /**
     *
     * @param dni
     * @param nombre
     * @param apellido
     * @param telefono
     * @param email
     */
    Titular(String dni, String nombre, String apellido, int telefono, String email){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
    }

    /**
     *
     * @param dni
     */
    //DNI
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return String dni
     */
    public String getDni() {
        return dni;
    }


    //Nombre
    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }
    //Apellidos

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return String apellido
     */
    public String getApellido() {
        return apellido;
    }
    //Telefono

    /**
     *
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return int teléfono
     */
    public int getTelefono() {
        return telefono;
    }
    //Email

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return String email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return String concatena el nombre con el apellido
     */
    public String nombreCompleto(){
        return this.nombre + " " + this.apellido;
    }
}
