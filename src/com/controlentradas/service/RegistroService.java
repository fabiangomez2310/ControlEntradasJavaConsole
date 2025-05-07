package com.controlentradas.service;

import com.controlentradas.model.Persona;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author FABIANG
 */

public class RegistroService {

    // Atributos
    private final List<Persona> personas = new ArrayList<>();
    private static final int VALOR_ENTRADA = 30000;
    private static int contador = 0;
    private static double totalRecaudado = 0;
    private static LocalDate hoy;
    private DateTimeFormatter formatter;

    // Métodos públicos

    public void registrarPersona(Persona persona) {
        calcularValorAPagar(persona);
        personas.add(persona);
        contador++;
        totalRecaudado += persona.getValorPagado();
    }

    public void imprimirTicket(Persona persona) {
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("=================================");
        System.out.println("Fecha: "+persona.getFechaHoraRegistro().format(formatter));
        System.out.println("Hola, " + persona.getNombres() + " " + persona.getApellidos());
        System.out.println("Tienes " + persona.getEdad() + " años.");
        System.out.println(persona.esMayorDeEdad() ? "ES MAYOR DE EDAD" : "Advertencia: ES MENOR DE EDAD");
        System.out.println(persona.esMayorDeEdad() ? 
            "Tiene todas las atracciones disponibles." : 
            "Tiene atracciones limitadas.");
        System.out.println("Valor pagado: $" + persona.getValorPagado());
        System.out.println("=================================");
    }

    public void mostrarResumen() {
        hoy = LocalDate.now();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("=================================");
        System.out.println("Resumen del día: " +hoy.format(formatter));
        System.out.println("Total asistentes: " + contador);
        System.out.println("Total recaudado: $" + totalRecaudado);
        System.out.println("=================================");
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    // Getters estáticos

    public static int getContador() {
        return contador;
    }

    public static double getTotalRecaudado() {
        return totalRecaudado;
    }

    // Método privado

    private void calcularValorAPagar(Persona persona) {
        double valor;
        int edad = persona.getEdad();

        if (edad <= 3 || edad >= 60) {
            valor = 0;
        } else if (edad <= 12) {
            valor = VALOR_ENTRADA * 0.40;
        } else if (edad <= 17) {
            valor = VALOR_ENTRADA * 0.60;
        } else {
            valor = VALOR_ENTRADA;
        }

        persona.setValorPagado(valor);
    }
}
