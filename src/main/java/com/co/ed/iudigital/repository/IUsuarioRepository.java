package com.co.ed.iudigital.repository;

import com.co.ed.iudigital.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long > {
}
