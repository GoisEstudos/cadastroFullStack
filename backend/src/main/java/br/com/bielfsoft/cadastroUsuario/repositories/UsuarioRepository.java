package br.com.bielfsoft.cadastroUsuario.repositories;

import br.com.bielfsoft.cadastroUsuario.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
}
