package com.co.ed.iudigital.service;

import com.co.ed.iudigital.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoleService {


    List<Role> getAll();
}

