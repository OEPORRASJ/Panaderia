/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia.modelo;

import java.util.Date;

/**
 *
 * @author OSKAR
 */
public class Promocion {
    private double porcentajeDcto;
    private Date vigencia;
    
    private Producto producto;

    public Promocion(double porcentajeDcto, Date vigencia) {
        this.porcentajeDcto = porcentajeDcto;
        this.vigencia = vigencia;
        
    }

    public double getPorcentajeDcto() {
        return porcentajeDcto;
    }

    public void setPorcentajeDcto(double porcentajeDcto) {
        this.porcentajeDcto = porcentajeDcto;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
    
}
