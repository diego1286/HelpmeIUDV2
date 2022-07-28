package com.co.ed.iudigital.service;

import com.co.ed.iudigital.dto.CasoDTO;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> findAll();

    // crear un caso

    CasoDTO save(CasoDTO caso );

    // inactivar el caso
    Boolean visible(Boolean visible, Long id);

    // consultar caso por Id
    CasoDTO findById(Long id);


}
