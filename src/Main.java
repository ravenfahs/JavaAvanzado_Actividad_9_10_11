public class Main {
    public static void main(String[] args) {

        Ventanilla ventanilla = new Ventanilla();

        //Dependiendo de la edad de la persona, se tomará un tiempo de 5 minutos si es menor que 60 años,
        //si es mayor, se atenderá de inmediato.
        Persona persona = new Persona("Fabian", "Hernandez",10);

        System.out.println(ventanilla.estado.cerrarVentanilla());
        System.out.println(ventanilla.estado.abrirVentanilla());
        System.out.println(ventanilla.estado.hacerFila(persona));
        System.out.println(ventanilla.estado.atenderCliente(persona));
    }
}