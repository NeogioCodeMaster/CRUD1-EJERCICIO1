package com.example.crud1.services;

@Service
public class UsuarioService {
    
    @Autowires
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
}
