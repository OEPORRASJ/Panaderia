
package panaderia.modelo;


public class Abastecimiento {
    private int cantidadAbastecida;
    private String nombreProveedor;
    private double costoPedido;
    
    private Producto producto;

    public Abastecimiento(int cantidadAbastecida, String nombreProveedor, double costoPedido, Producto producto) {
        this.cantidadAbastecida = cantidadAbastecida;
        this.nombreProveedor = nombreProveedor;
        this.costoPedido = costoPedido;
        this.producto = producto;
    }

    public int getCantidadAbastecida() {
        return cantidadAbastecida;
    }

    public void setCantidadAbastecida(int cantidadAbastecida) {
        this.cantidadAbastecida = cantidadAbastecida;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public double getCostoPedido() {
        return costoPedido;
    }

    public void setCostoPedido(double costoPedido) {
        this.costoPedido = costoPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    public double infoPedido(){
        
        int cantidad = cantidadAbastecida + producto.getCantidad();
        producto.setCantidad(cantidad);
        
        costoPedido = cantidadAbastecida * producto.getPrecioCompra();
        return costoPedido;
    }
    
    
}
