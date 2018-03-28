
package panaderia.modelo;

import java.util.ArrayList;


public class Inventario {
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;
    private ArrayList<Abastecimiento> abastecimientos;

    public Inventario(ArrayList<Producto> productos, ArrayList<Venta> ventas, ArrayList<Abastecimiento> abastecimientos) {
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
        abastecimientos = new ArrayList<>();
    }
    
    
   
    
    
    
    public void mostrarInventario(){
        
        for (int i = 0; i < productos.size() ; i++) {
            System.out.println("Inventario");
            System.out.println(productos.get(i).getNombre() + productos.get(i).getCantidad());
            
        }       
    }
    
    
    public void historialVentas(){
        for (int i = 0; i < ventas.size() ; i++) {
            System.out.println("Ventas");
            System.out.println(ventas.get(i).getFecha() + ventas.get(i).getProducto().getNombre() + ventas.get(i).getGananciaVenta());
            
        }
    }
    
    public double gananciasTotales(){
        double contador = ventas.get(0).getGananciaVenta();
        for (int i = 1; i <= ventas.size() ; i++) {
            contador = contador + ventas.get(i).getGananciaVenta();
            
        }
        return contador;
    }
    
    public void mostrarCaja(){
        double caja;
    
        for (int i = 1; i <= ventas.size() ; i++) {
            caja = ventas.get(i).getMontoVenta() - abastecimientos.get(i).getCostoPedido();
            
        }
        
    
    
    }
   
    
        
}
    

