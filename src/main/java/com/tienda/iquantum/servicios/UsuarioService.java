package com.tienda.iquantum.servicios;

import com.tienda.iquantum.entidades.Usuario;
import com.tienda.iquantum.entidades.UsuarioRol;
import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);

}
