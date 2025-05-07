/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FABIANG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres;

        String apellidos;

        int edad;

        boolean seguir = false;

        List<Persona> personas = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        System.out.println("Sistema Control de Ingreso a las Atracciones");

        do {
            System.out.print("Digite apellidos del usuario: ");
            apellidos = leer.nextLine();

            System.out.print("Digite nombres del usuario: ");
            nombres = leer.nextLine();

            System.out.print("Digite la edad del usuario: ");
            edad = leer.nextInt();
            leer.nextLine();

            Persona persona = new Persona(nombres, apellidos, edad);
            persona.imprimirTicket();

            System.out.println("Seguir agregando? (s/n): ");
            String op = leer.nextLine();

            personas.add(persona);

            seguir = op.equalsIgnoreCase("s");

        } while (seguir);

        System.out.println("Total asistentes: " + Persona.getContador());
        System.out.println("Total recaudado: $"+ Persona.getTotalRecaudado());

        System.out.println("Desea imprimir reporte detallado de asistentes? (s/n): ");
        String op = leer.nextLine();

        if (op.equalsIgnoreCase("s")) {

            System.out.println("Asistentes del dia:");
            int index = 1;
            for (Persona persona : personas) {
                System.out.print(index + ". ");
                persona.mostrarListado();
                index++;
            }
        } else {
            System.out.println("Saliendo sin imprimir reporte.");

        }

    }

}
