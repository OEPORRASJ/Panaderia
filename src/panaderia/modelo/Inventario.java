
package panaderia.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Inventario {
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;
    private ArrayList<Abastecimiento> abastecimientos;

    public Inventario() {
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
        abastecimientos = new ArrayList<>();
    }
    
    Scanner lector = new Scanner(System.in);
    public void anadirProducto() throws ParseException{
        System.out.println("Anadir Producto");
        System.out.println("Agregue nombre del producto");
        String nombre = lector.next();
        System.out.println("Agregue el precio de compra del producto");
        double precioC = lector.nextDouble();
        System.out.println("Agregue el precio de venta del producto");
        double precioV = lector.nextDouble();
        System.out.println("Agregue la cantidad inicial del producto");
        int cantidad = lector.nextInt();
        
        System.out.println("Indique el porcentaje de descuento de la Promocion: ");
        double porcentaje = lector.nextDouble() / 100;
        
        System.out.println("Fecha de vigencia de la Promocion (dd/mm/yyyy) :");
        Date vigencia = new SimpleDateFormat("dd/mm/yyyy").parse(lector.next());
        
        
        
        Producto listaProductos = new Producto(nombre, precioC, precioV, cantidad, porcentaje, vigencia);
        this.productos.add(listaProductos);
        
        
        
    }
    
    
    
    public void eliminarProducto(){
        System.out.println("Escriba el nombre del producto que desea eliminar: ");
        String eliminar = lector.next();
        
        for (int i = 0; i < productos.size() ; i++) {
            if(eliminar.compareTo(productos.get(i).getNombre()) == 0){
                productos.remove(productos.get(i));
            }
            
        }
    }
    
    
    public void realizarVenta(){
        System.out.println("Venta");
        System.out.println("Cantidad a vender: ");
        int cantidad = lector.nextInt();
        
        Date fechaActual = new Date();
        
        System.out.println("Nombre del producto a vender: ");
        String productoAvender = lector.next();
        Producto producto = null;
        for (int i = 0; i < productos.size() ; i++) {
            if (productoAvender.compareTo(productos.get(i).getNombre()) == 0) {
                producto = productos.get(i);
                
            }
        }
        
        
        System.out.println("Datos del cliente");
        System.out.println("Nombre: ");
        String nombreC = lector.next();
        System.out.println("Telefono: ");
        String telefonoC = lector.next();
        Cliente cliente = new Cliente(nombreC, telefonoC);
        
        Venta realizarVenta = new Venta(ventas.size() +1 , cantidad, fechaActual, producto, cliente);
        realizarVenta.infoVenta();
        realizarVenta.infoCliente();
        ventas.add(realizarVenta);
        

    }
    
    
    public void eliminarVenta(){
        System.out.println("Escriba el numero de Venta a Eliminar");
        int eliminar = lector.nextInt();
        for (int i = 0; i < ventas.size() ; i++) {
            if(eliminar == ventas.get(i).getId()){
                ventas.remove(i);
            }
        }
        
    }
    
    
    public void abastecimiento(){
        System.out.println("Abastecimiento de productos");
        System.out.println("Nombre del producto a abastecer:");
        String nombre = lector.next();
        System.out.println("Cantidad: ");
        int cantidad = lector.nextInt();
        for (int i = 0; i < productos.size() ; i++) {
            if(nombre.compareTo(productos.get(i).getNombre()) == 0){
                int cantidadNueva = productos.get(i).getCantidad() + cantidad;
                productos.get(i).setCantidad(cantidadNueva);                     
                       
            }
            
        }
    }
   
    
    
    
    
    
    public void mostrarInventario(){
        System.out.println("Inventario");
        System.out.println("Producto  -  Cantidad");
        for (int i = 0; i < productos.size() ; i++) {
            System.out.println( productos.get(i).getNombre() 
                    + " - " + productos.get(i).getCantidad());
            
        }       
    }
    
    
    public void historialVentas(){
        System.out.println("Ventas");
        for (int i = 0; i < ventas.size() ; i++) {
            System.out.println(ventas.get(i).getFecha()
                    + " " + ventas.get(i).getProducto().getNombre() + " " +  ventas.get(i).getGananciaVenta());
            
        }
    }
    
    
    
    public void mostrarCaja(){
        double total = 0;
        for (int i = 0; i < ventas.size() ; i++) {
             double venta = ventas.get(i).getMontoVenta();
             total = total + venta;
        }
        System.out.println("El dinero en Caja es: " + total );
    }
   
    public void gananciasTotales(){
        double total=0;
        for(int i=0 ; i<ventas.size() ; i++){
            double ganancias = ventas.get(i).getGananciaVenta();
            total = total + ganancias;
        }
        System.out.println("las ganancias son: " + total);
     
    }
    
        
}
    

