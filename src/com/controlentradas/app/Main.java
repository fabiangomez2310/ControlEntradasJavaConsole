package com.controlentradas.app;

import com.controlentradas.model.Persona;
import com.controlentradas.service.RegistroService;
import com.controlentradas.util.ConsoleHelper;
import java.util.List;

/**
 *
 * @author FABIANG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RegistroService registro = new RegistroService();

        System.out.println("=== Sistema Control de Ingreso a las Atracciones ===");

        boolean seguir;
        do {
            String apellidos = ConsoleHelper.leerTexto("Digite apellidos del usuario: ");
            String nombres = ConsoleHelper.leerTexto("Digite nombres del usuario: ");
            int edad = ConsoleHelper.leerEntero("Digite la edad del usuario: ");

            Persona persona = new Persona(nombres, apellidos, edad);
            registro.registrarPersona(persona);
            registro.imprimirTicket(persona);

            seguir = ConsoleHelper.leerTexto("¿Seguir agregando? (s/n): ").equalsIgnoreCase("s");
        } while (seguir);

        registro.mostrarResumen();

        boolean imprimirReporte = ConsoleHelper.leerTexto("¿Desea imprimir reporte detallado de asistentes? (s/n): ")
                .equalsIgnoreCase("s");

        if (imprimirReporte) {
            List<Persona> personas = registro.getPersonas();
            System.out.println("\n--- Asistentes del día ---");
            int index = 1;
            for (Persona p : personas) {
                System.out.print(index++ + ". ");
                p.mostrarListado();
            }
        } else {
            System.out.println("Saliendo sin imprimir reporte.");
        }
    }
}
