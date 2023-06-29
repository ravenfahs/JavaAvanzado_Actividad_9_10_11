public class VentanillaEnEspera extends Estado{
    public VentanillaEnEspera(Ventanilla ventanilla) {
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
       // System.out.println("Espere su turno...");
        /*
        if(persona.getEdad()>60){
            System.out.println("Por favor pase a ventanilla: " + persona.getNombre() + " " +
                    persona.getApellido());
        }else {
            System.out.println("Por favor espere 5 minutos...");
        }
        */

        //Se aplica el operador ternario
        String s = persona.getEdad() > 60 ? "Por favor pase a ventanilla: " + persona.getNombre() + " " + persona.getApellido() : "Por favor espere 5 minutos...";

        System.out.println(s);
        ventanilla.cambiarEstado(new VentanillaConAtencionDeCliente(ventanilla));
        return "Ok";
    }

    @Override
    public String atenderCliente(Persona persona) {
        return "Oppps error - Ventanilla no disponible....";
    }
}
