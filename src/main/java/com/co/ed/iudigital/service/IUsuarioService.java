package com.co.ed.iudigital.service;

import com.co.ed.iudigital.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> findAll();// busca todosa los usuarios

    Usuario findById(Long id);// busca usuarios por id

    Usuario save(Usuario usuario); // guarda un usuario

    Usuario findByUsername(String username); // busca usuarios por username



}
