/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class Venta extends Producto {
    
    private String nombreCliente;
    private String metodoPago;
    private int cantidadComprada;
    private int saldo;
    Scanner input = new Scanner(System.in);

    public Venta() {
        
        super();
        this.nombreCliente = nombreCliente;
        this.metodoPago = metodoPago;
        this.cantidadComprada = cantidadComprada;
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public String getNombreProducto() {
        return super.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCosto() {
        return super.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return super.precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return super.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
    public int registrarVenta(double cantidad, double precioVenta){
        this.saldo = (int)cantidad * (int)precioVenta;
        return saldo;
    }

    public int actualizarInventario(double cantidadInventario){

        
        double inventario = cantidadInventario - cantVender;


    }
    
    public double cobrarVenta(int saldoNuevo){
        
        double resultado = saldoNuevo + saldo;
        
        return resultado;
    }
    
}
