/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author desarrollo
 */
public class Producto {
    
    protected String nombreProducto;
    protected double costo;
    protected double precioVenta;
    protected int cantidad;

    public Producto() {
        this.nombreProducto = nombreProducto;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void registrarProducto(String nombreProducto,  double costo, double precioVenta, int cantidad){
        System.out.println("Nombre Producto: " + nombreProducto + "\n" +
                            "Costo Producto: " + costo + "\n" +
                            "Precio de Venta: " + precioVenta + "\n" +
                            "Cantidad: " + cantidad);
    }
    
}
