package com.co.ed.iudigital.repository;

import com.co.ed.iudigital.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long > {
    // leer compresion de metodos jpa leerl sobre jpa JQL

    //se hace las consultas con este metodo  findByUsername leer sobre este

    //@Query("SELECT u FROM  Usuario u WHWRW u.username=?1"); Las consultas se pueden hacer de estos dos
    // modos la @query te hace las consultas personalizadas, o se pueden hacer con el  findByUsername
    Usuario findByUsername(String username);

}
