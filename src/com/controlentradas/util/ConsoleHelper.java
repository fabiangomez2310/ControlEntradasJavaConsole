/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controlentradas.util;

import java.util.Scanner;

/**
 *
 * @author FABIANG
 */
public class ConsoleHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    public static int leerEntero(String mensaje) {
        int numero = -1;
        boolean valido = false;
        do {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                numero = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un numero valido.");
            }

        } while (!valido);
        return numero;

    }

    public static boolean confirmar(String mensaje) {
        System.out.print(mensaje + " (s/n): ");
        String entrada = scanner.nextLine().trim().toLowerCase();
        return entrada.equals("s");
    }
}
