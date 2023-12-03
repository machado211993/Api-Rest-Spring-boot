package com.usuariosapp.usuarios.controllers;

import com.usuariosapp.usuarios.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public List<Usuario> crear(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("manuel");
        usuario.setApellido("machado");
        usuario.setEmail("machado.j.m@gmail.com");
        usuario.setTelefono("3794862502");
        return usuario;
    }

    @RequestMapping(value = "usuario213123")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("manuel");
        usuario.setApellido("machado");
        usuario.setEmail("machado.j.m@gmail.com");
        usuario.setTelefono("3794862502");
        return usuario;
    }

    @RequestMapping(value = "usuario123123")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("manuel");
        usuario.setApellido("machado");
        usuario.setEmail("machado.j.m@gmail.com");
        usuario.setTelefono("3794862502");
        return usuario;
    }

    @RequestMapping(value = "usuario1231")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("manuel");
        usuario.setApellido("machado");
        usuario.setEmail("machado.j.m@gmail.com");
        usuario.setTelefono("3794862502");
        return usuario;
    }
}
