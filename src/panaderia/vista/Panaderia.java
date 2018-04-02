/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia.vista;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import panaderia.modelo.Producto;
import panaderia.modelo.Promocion;
import panaderia.modelo.Venta;
import panaderia.modelo.Cliente;
import panaderia.modelo.Inventario;

/**
 *
 * @author OSKAR
 */
public class Panaderia {

    public static void main(String[] args) throws ParseException {
        Scanner lector = new Scanner(System.in);
        Inventario panaderia = new Inventario();  
        
         System.out.println("Panaderia El Triunfo-Menu Principal");
        System.out.println("Seleccione una opcion:"
                + " \n 1.Registrar Producto \n 2.Eliminar Producto \n 3.Realizar Venta \n 4.Eliminar Venta"
                + " \n 5.Abastecimiento \n 6.Mostrar Caja \n 7.Historial de Ventas"
                + " \n 8.Mostrar Inventario \n 9.Ganancias Totales ");
        
       
        int opcion = lector.nextInt();
        do {
            switch(opcion){
                case 1:
                    panaderia.anadirProducto();
                    break;
                case 2:
                    panaderia.eliminarProducto();
                    break;
                case 3:
                    panaderia.realizarVenta();
                    
                    break;
                case 4:
                    panaderia.eliminarVenta();
                    break;
                case 5:
                    panaderia.abastecimiento();
                    break;
                case 6:
                    panaderia.mostrarCaja();
                    break;  
                case 7:
                    panaderia.historialVentas();
                    break;    
                case 8:
                    panaderia.mostrarInventario();
                    break;
                case 9:
                    panaderia.gananciasTotales();
             
                
            }
        System.out.println("Panaderia El Triunfo-Menu Principal");
        System.out.println("Seleccione una opcion:"
                + " \n 1.Registrar Producto \n 2.Eliminar Producto \n 3.Realizar Venta \n 4.Eliminar Venta"
                + " \n 5.Abastecimiento \n 6.Mostrar Caja \n 7.Historial de Ventas"
                + " \n 8.Mostrar Inventario \n 9.Ganancias Totales");
            opcion = lector.nextInt();
        } while (opcion != 0 && opcion <= 9);
      
        
        
    }
     
}
