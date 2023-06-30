
package com.tienda.iquantum.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sonidos")
public class Sonido {
    
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sonidoId;
      
    private String nombreS;
    
    @Column(length = 5000)
    private String descripcionS;
    
    private int precioS;
    
    private String imagenS;
    
    //CONSTRUCTOR

    public Sonido() {
    }
    //GETERS AND SETTERS

    public Long getSonidoId() {
        return sonidoId;
    }

    public void setSonidoId(Long sonidoId) {
        this.sonidoId = sonidoId;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getDescripcionS() {
        return descripcionS;
    }

    public void setDescripcionS(String descripcionS) {
        this.descripcionS = descripcionS;
    }

    public int getPrecioS() {
        return precioS;
    }

    public void setPrecioS(int precioS) {
        this.precioS = precioS;
    }

    public String getImagenS() {
        return imagenS;
    }

    public void setImagenS(String imagenS) {
        this.imagenS = imagenS;
    }
    
    
}
