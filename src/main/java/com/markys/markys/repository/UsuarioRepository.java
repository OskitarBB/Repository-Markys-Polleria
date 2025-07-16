package com.markys.markys.repository;

import com.markys.markys.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);

    // Metodo para encontrar usuarios por nombre de rol
    List<Usuario> findByRolesNombre(String nombreRol);
}
