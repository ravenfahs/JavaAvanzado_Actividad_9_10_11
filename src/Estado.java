public abstract class Estado {

    public Ventanilla ventanilla;

    //El constructor con un parámetro de entrada, un objeto de la clase Ventanilla
    public Estado(Ventanilla ventanilla){
        this.ventanilla = ventanilla;
    }

    //Métodos abstractos para el estado del objeto que se va a contralor su secuencia,
    //en este caso se trata de simular o abstraer del mundo una ventanilla de atención al cliente
    //los estados de una ventanilla puede ser un banco, ventanilla abierta, cerrada, hacer fila, y
    //atender al cliente, y de estos se genera una por cada estado, en este caso cada método devuelve
    // un String.

    abstract public String abrirVentanilla();

    abstract public String cerrarVentanilla();

    abstract public String hacerFila(Persona persona);
    abstract public String atenderCliente(Persona persona);

    public String getVentanilla(){
        return "Estado" +
                "ventanilla=" + ventanilla;
    }
}
