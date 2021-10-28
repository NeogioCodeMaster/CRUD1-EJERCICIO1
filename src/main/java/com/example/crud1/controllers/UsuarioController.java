package com.example.crud1.controllers;

import java.util.ArrayList;

import com.example.crud1.models.UsuarioModel;
import com.example.crud1.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping
    public ArrayList<UsuarioModel> obtenerUsuario(){
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuarios(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }
}
