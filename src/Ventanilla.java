public class Ventanilla {

    public Estado estado;

    //Punto de inicio de la secuencia de pasos.
    public Ventanilla(){
        estado = new VentanillaCerrada(this);
    }

    //la ventanilla es donde hace el cambio de estado con objeto estado

    public void cambiarEstado(Estado estado){
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado Final: "+ this.estado.getClass().getName());
    }
}
