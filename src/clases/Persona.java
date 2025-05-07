/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author FABIANG
 */
public class Persona {

    private static int VALOR_ENTRADA = 30000;

    private static int contador = 0;
    private static double totalRecaudado = 0;
    private String nombres;
    private String apellidos;
    private int edad;
    private double valorPagado;

    public Persona() {
        System.out.println("Se creo la persona sin los datos, (nombres, apellidos, edad)");
    }

    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        contador++;
    }

    // metodos publicos
    public void imprimirTicket() {
        if (this.apellidos == null || this.nombres == null || this.edad == 0) {
            System.out.println("Error: No hay datos para mostrar.");
        } else {
            saludar();
        }
        System.out.println("=================================");

    }

    public void mostrarListado() {
        if (this.apellidos == null || this.nombres == null || this.edad == 0) {
            System.out.println("Error: No hay datos para mostrar.");
        } else {
            System.out.println("Apellidos: " + this.apellidos + " - Nombres: " + this.nombres + " - Edad: " + this.edad);
        }
    }

    // metodos privados
    private void generarValorAPagar() {
        if (this.edad <= 3 || this.edad >= 60) {
            this.valorPagado = VALOR_ENTRADA * 0;
            
        } else if (this.edad >= 4 && this.edad <= 12) {
            this.valorPagado = VALOR_ENTRADA * 0.40;
        } else if (this.edad >= 13 && this.edad <= 17) {
            this.valorPagado = VALOR_ENTRADA * 0.60;
        } else {
            this.valorPagado = VALOR_ENTRADA * 1;
        }
        
        this.totalRecaudado += this.valorPagado;

    }

    private void saludar() {
        System.out.println("Bienvenido, ");
        System.out.println("Hola, " + this.nombres + " " + this.apellidos);
        mensajeMayorDeEdad();
        atraccionesDisponibles();
        generarValorAPagar();
        System.out.println("Valor Pagado: $" + this.valorPagado);
    }

    private void mensajeMayorDeEdad() {
        System.out.println("Tienes " + this.edad + " años. ");
        if (esMayorDeEdadBoolean()) {
            System.out.println("ES MAYOR DE EDAD");

        } else {
            System.out.println("Advertencia: ES MENOR DE EDAD");
        }
    }

    private void atraccionesDisponibles() {
        if (esMayorDeEdadBoolean()) {
            System.out.println("Tiene todas las atracciones dispobibles");
        } else {
            System.out.println("Tiene atracciones limitadas de acuerdo con tu edad.");
        }
    }

    private boolean esMayorDeEdadBoolean() {
        return (this.edad >= 18);
    }

    // getters and setters

    public static double getTotalRecaudado() {
        return totalRecaudado;
    }

    public static void setTotalRecaudado(double totalRecaudado) {
        Persona.totalRecaudado = totalRecaudado;
    }
    
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

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

}
