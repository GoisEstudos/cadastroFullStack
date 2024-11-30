package br.com.bielfsoft.cadastroUsuario.services;

import br.com.bielfsoft.cadastroUsuario.dtos.UsuarioDeleteDto;
import br.com.bielfsoft.cadastroUsuario.dtos.UsuarioDto;
import br.com.bielfsoft.cadastroUsuario.dtos.UsuarioUpdateDto;
import br.com.bielfsoft.cadastroUsuario.entities.Usuarios;
import br.com.bielfsoft.cadastroUsuario.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository userRepository;

    public UsuarioService(UsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Usuarios> findAll() {
        return userRepository.findAll();
    }

    public Usuarios save(UsuarioDto dto) {
        Usuarios user = new Usuarios(new UsuarioDto(dto.nome(), dto.idade(), dto.email()));
        return userRepository.save(user);
    }

    public Usuarios update(UsuarioUpdateDto dto){
        Usuarios usuarios = userRepository.findById(dto.id()).orElseThrow();
        usuarios.setIdade(dto.idade());
        usuarios.setEmail(dto.email());
        return userRepository.save(usuarios);
    }

    public Usuarios delete(UsuarioDeleteDto dto){
        Usuarios usuarios = userRepository.findById(dto.id()).orElseThrow();
        userRepository.delete(usuarios);
        return usuarios;
    }
}
