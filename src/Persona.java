public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor
    public Persona(String nombre, String apellido, int edad) {
        setApellido(apellido);
        setNombre(nombre);
        setEdad(edad);
    }

    //Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String gerPersona(){
        return "Persona" +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Edad: " + edad;
    }
}
