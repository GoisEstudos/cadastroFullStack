package br.com.bielfsoft.cadastroUsuario.controllers;

import br.com.bielfsoft.cadastroUsuario.dtos.UsuarioDeleteDto;
import br.com.bielfsoft.cadastroUsuario.dtos.UsuarioDto;
import br.com.bielfsoft.cadastroUsuario.dtos.UsuarioUpdateDto;
import br.com.bielfsoft.cadastroUsuario.entities.Usuarios;
import br.com.bielfsoft.cadastroUsuario.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService userService;

    public UsuarioController(UsuarioService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<Usuarios>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<Usuarios> save(@RequestBody UsuarioDto dto) {
        return ResponseEntity.ok(userService.save(dto));
    }

    @PatchMapping
    public ResponseEntity<Usuarios> update(@RequestBody UsuarioUpdateDto dto) {
        return ResponseEntity.ok(userService.update(dto));
    }

    @DeleteMapping
    public ResponseEntity<Usuarios> delete(@RequestBody UsuarioDeleteDto dto) {
        return ResponseEntity.ok(userService.delete(dto));
    }
}
