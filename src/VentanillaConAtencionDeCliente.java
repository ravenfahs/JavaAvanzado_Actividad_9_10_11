public class VentanillaConAtencionDeCliente extends Estado{
    public VentanillaConAtencionDeCliente(Ventanilla ventanilla) {
        super(ventanilla);
    }

    @Override
    public String abrirVentanilla() {
        return "Oppps error - Ventanilla no disponible....";
    }

    @Override
    public String cerrarVentanilla() {
        return "Oppps error - Ventanilla no disponible....";
    }

    @Override
    public String hacerFila(Persona persona) {
        return  "Oppps error - Fila no disponible....";
    }

    @Override
    public String atenderCliente(Persona persona) {
        System.out.println("Atendiendo al cliente..." + " " + persona.getNombre() + " " + persona.getApellido());
        ventanilla.cambiarEstado(new VentanillaCerrada(ventanilla));
        return "Ok";
    }
}
