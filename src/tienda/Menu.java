/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.Scanner;


public class Menu extends Cliente {
    
    Scanner input = new Scanner(System.in);
    
    Cliente cliente = new Cliente();
    
    Producto producto = new Producto();
    
    Venta venta = new Venta();
    
    private int opc;
    private boolean sesion;
    private int tipoUsuario;
    private int saldo;
    
    public Menu() {
        this.opc = opc;
        this.sesion = sesion;
        this.tipoUsuario = tipoUsuario;
        this.saldo = saldo;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public boolean isSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void iniciarMenu(){
        while (opc != 5){
            System.out.println("Ingrese una Opcion:");
            System.out.println("1) Registrar Producto" + "\n" +
                               "2) Registrar Venta" + "\n" +
                               "3) Consultar Saldo Cuenta por Cobrar" + "\n" +
                               "4) Consultar Inventario" + "\n" +
                               "5) Salir");
            
            opc = input.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Escogio Registrar Producto");
                    System.out.println("Ingrese el nombre del producto: ");
                    producto.nombreProducto = input.next();
                    System.out.println("Ingrese el Costo del Producto: ");
                    producto.costo = input.nextDouble();
                    System.out.println("Ingrese el Precio de Venta: ");
                    producto.precioVenta = input.nextDouble();
                    System.out.println("Ingrese la Cantidad a añadir a Inventario: ");
                    producto.cantidad = input.nextInt();
                            
                    producto.registrarProducto(producto.nombreProducto,producto.costo,producto.precioVenta,producto.cantidad);
                    break;
                case 2:
                    System.out.println("Escogio Registrar Venta");
                    this.saldo = venta.registrarVenta(10,14990);
                    break;
                case 3: 
                    System.out.println("Escogio Consultar Saldo CxC");
                    double nuevoSaldo = venta.cobrarVenta(saldo);
                    System.out.println("El nuevo saldo es: " + nuevoSaldo);
                    break;
                case 4:
                    System.out.println("Escogio Consultar Inventario");
                    break;
                case 5:
                    System.out.println("Salio del Sistema");
                    break;
            }
        }
    }
}
