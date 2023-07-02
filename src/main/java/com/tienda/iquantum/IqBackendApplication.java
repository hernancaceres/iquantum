package com.tienda.iquantum;

import com.tienda.iquantum.entidades.Rol;
import com.tienda.iquantum.entidades.Usuario;
import com.tienda.iquantum.entidades.UsuarioRol;
import com.tienda.iquantum.servicios.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class IqBackendApplication implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;
    
     // inyeccion de  dependencia para encriptar password
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(IqBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        Usuario usuario = new Usuario();
        
        
        usuario.setNombre("Hernan");
        usuario.setApellido("Caceres");
        usuario.setUsername("hernan");
        // sin incriptar password
        //usuario.setPassword("12345");
        // incriptar password
        usuario.setPassword(bCryptPasswordEncoder.encode("12345"));
        usuario.setEmail("hernan@gmail.com");
        usuario.setTelefono("937596249");
        usuario.setPerfil("foto.png");

        Rol rol = new Rol();
        rol.setRolId(1L);
        rol.setRolNombre("ADMIN");

        Set<UsuarioRol> usuariosRoles = new HashSet<>();
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setRol(rol);
        usuarioRol.setUsuario(usuario);
        usuariosRoles.add(usuarioRol);

        Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuariosRoles);
        System.out.println(usuarioGuardado.getUsername());
         */ 
    }

}
