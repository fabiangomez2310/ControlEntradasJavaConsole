package com.controlentradas.model;

/**
 *
 * @author FABIANG
 */
public class Persona {

    // Atributos
    private String nombres;
    private String apellidos;
    private int edad;
    private double valorPagado;

    // Constructor
    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Métodos públicos
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void mostrarListado() {
        System.out.println("Apellidos: " + apellidos + " - Nombres: " + nombres + " - Edad: " + edad +" Valor Pagado: "+valorPagado);
    }

    // Getters y Setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }
}
