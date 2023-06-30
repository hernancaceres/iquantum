
package com.tienda.iquantum.Dto;

import javax.validation.constraints.NotBlank;


public class DtoProducto {
    
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private int precioP;
    
     //CONSTRUCTORES

    public DtoProducto() {
    }

    public DtoProducto(String nombreP, String descripcionP, int precioP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.precioP = precioP;
    }
    
    //GETERS AND SETTERS

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public int getPrecioP() {
        return precioP;
    }

    public void setPrecioP(int precioP) {
        this.precioP = precioP;
    }
    
  
}
