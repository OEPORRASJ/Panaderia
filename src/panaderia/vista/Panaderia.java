/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia.vista;

import java.util.ArrayList;
import java.util.Date;
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

    public static void main(String[] args) {
        Date vigencia = new Date(2018,02,30,8,30,00);
        Date fecha2 = new Date(2018,03,05);
        Date fecha = new Date();
        
  
        Cliente cliente1 = new Cliente ("paco", "35257582");
        
        Producto p1 = new Producto("Queso", 7000, 10000, 5, 0.25, vigencia);
        Producto p2 = new Producto("Pan", 100, 300, 300,0.18, fecha2);
      
        Venta venta1 = new Venta(100, fecha, p2, cliente1);
        Venta venta2 = new Venta(4,fecha2,p1, cliente1);
        
        Inventario panaderia = new Inventario(new ArrayList<>(), new ArrayList <>(), new ArrayList<>());
        panaderia.addProducto(p1);
     
       
        
        
        
        
        
    }
     
}
