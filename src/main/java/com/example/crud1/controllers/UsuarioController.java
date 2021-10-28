package com.example.crud1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    
    @Autowired
    @UsuarioService usuarioService;
    @GetMapping
    public ArrayList<UsuarioModel> obtenerUsuario(){
        return usuarioService.getUsuario();
    }

    @pos
    public UsuarioModel
}
