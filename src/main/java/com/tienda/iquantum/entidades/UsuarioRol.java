
package com.tienda.iquantum.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private Rol rol;

    //CONSTRUCTOR
    public UsuarioRol() {
    }

    public Long getUsuarioRolId() {
        return usuarioRolId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setUsuarioRolId(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    
    
    
    
}
