public class VentanillaCerrada extends Estado{


    public VentanillaCerrada(Ventanilla ventanilla) {
        super(ventanilla);
    }

    @Override
    public String abrirVentanilla () {
        return "Oppps error - Ventanilla no disponible....";

    }

    public String cerrarVentanilla() {
        System.out.println("Ventanilla cerrada....");
        ventanilla.cambiarEstado(new VentanillaAbierta(ventanilla));
        return "Ok";
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
