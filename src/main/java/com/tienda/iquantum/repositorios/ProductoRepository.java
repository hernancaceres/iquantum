
package com.tienda.iquantum.repositorios;

import com.tienda.iquantum.entidades.Producto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    
     public Optional<Producto> findByNombreP(String nombreP);

    public boolean existsByNombreP(String nombreP);
    
}
