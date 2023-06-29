public class VentanillaAbierta extends Estado{

    //Constructor de la clase Estado
    public VentanillaAbierta(Ventanilla ventanilla){
        super(ventanilla);
    }

    @Override
    public String abrirVentanilla() {
        System.out.println("Ventanilla disponible....");
        ventanilla.cambiarEstado(new VentanillaEnEspera(ventanilla));
        return "Ok";
    }

    @Override
    public String cerrarVentanilla() {
        return "Oppps error - Ventanilla no disponible";
    }

    @Override
    public String hacerFila(Persona persona) {
        return "Oppps error - Fila no disponible....";
    }

    @Override
    public String atenderCliente(Persona persona) {
        return "Oppps error - No se puede atender la cliente, Fila no disponible....";
    }
}
