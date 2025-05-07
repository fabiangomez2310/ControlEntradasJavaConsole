package com.controlentradas.model;

import java.time.LocalDateTime;

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
    private LocalDateTime fechaHoraRegistro;

    // Constructor
    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaHoraRegistro = LocalDateTime.now();
    }

    // Métodos públicos
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void mostrarListado() {
        System.out.println(apellidos + " " + nombres + " | " + edad + " | " + valorPagado + " | " + fechaHoraRegistro);
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

    public LocalDateTime getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }
}
