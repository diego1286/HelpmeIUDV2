package com.co.ed.iudigital.service.impl;

import com.co.ed.iudigital.model.Role;
import com.co.ed.iudigital.repository.IRoleRepository;
import com.co.ed.iudigital.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl  implements IRoleService {

    @Autowired // inyección de dependencias
    private IRoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }




}
