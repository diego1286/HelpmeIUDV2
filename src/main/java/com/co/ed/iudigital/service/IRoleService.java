package com.co.ed.iudigital.service;

import com.co.ed.iudigital.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRoleService  {

    List<Role> getAll();
}

