
package br.com.bielfsoft.cadastroUsuario.entities;

import br.com.bielfsoft.cadastroUsuario.dtos.UsuarioDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USUARIOS")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private String email;

    public Usuarios(UsuarioDto dto) {
        this.nome = dto.nome();
        this.idade = dto.idade();
        this.email = dto.email();
    }
}
