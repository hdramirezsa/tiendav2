/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author desarrollo
 */
public class Cliente {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double saldoTarjeta;

    public Cliente() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.saldoTarjeta = saldoTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldoTarjeta() {
        return saldoTarjeta;
    }

    public void setSaldoTarjeta(double saldoTarjeta) {
        this.saldoTarjeta = saldoTarjeta;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre Cliente:" + nombre + "\n" +
                            "Apellido Cliente:" + apellido + "\n" +
                            "Edad Cliente:" + edad + "\n" +
                            "Saldo Tarjeta" + saldoTarjeta);
    }
    
    
    
}
