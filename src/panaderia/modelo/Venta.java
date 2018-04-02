package panaderia.modelo;

import java.util.Date;

public class Venta {

    private int cantidadVendida;
    private Date fecha;
    private double gananciaVenta;
    private double montoVenta;
    private int id;

    private Producto producto;
    private Cliente cliente;

    public Venta(int id,int cantidadVendida, Date fecha, Producto producto, Cliente cliente) {
        this.id = id;
        this.cantidadVendida = cantidadVendida;
        this.fecha = fecha;
        this.producto = producto;
        this.cliente = cliente;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getGananciaVenta() {
        return gananciaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double monto) {
        this.montoVenta = montoVenta;
    }

    public int getId() {
        return id;
    }

    
    
    double monto;

    public double infoVenta() {

        if (cantidadVendida <= producto.getCantidad()) {

            if (fecha.before(producto.getPromocion().getVigencia())) {
                monto = cantidadVendida * (producto.getPrecioVenta() - producto.getPrecioVenta()
                        * producto.getPromocion().getPorcentajeDcto());
                if (cantidadVendida >= 12) {
                    monto = monto * 0.9;
                }

            } else {
                if (cantidadVendida >= 12) {
                    monto = cantidadVendida * producto.getPrecioVenta() * 0.9;
                } else {
                    monto = cantidadVendida * producto.getPrecioVenta();

                }
            }

            int cantidad = producto.getCantidad() - cantidadVendida;
            producto.setCantidad(cantidad);

            System.out.println("La cantidad a cobrar es :" + monto);

            System.out.println("La cantidad nueva del inventario de " 
                    + producto.getNombre() + " es: " + producto.getCantidad());

            this.montoVenta = monto;

            gananciaVenta = monto - (producto.getPrecioCompra() * cantidadVendida);
            System.out.println("La ganancia de esta venta es :" + gananciaVenta);

            if (producto.getCantidad() <= 3) {
                System.out.println("Advertencia: Producto escaso: " + producto.getNombre());
            }

        } else {
            System.out.println("No hay inventario del producto");
        }

        return gananciaVenta;

    }

    public void infoCliente() {

        System.out.println("Nombre: " + cliente.getNombre() + " Telefono: " + cliente.getTelefono());
    }

}
