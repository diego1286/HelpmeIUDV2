package com.co.ed.iudigital.service;

import com.co.ed.iudigital.dto.DelitoDTO;
import com.co.ed.iudigital.model.Delito;

import java.util.List;

public interface IDelitoService {

    /* se puede trabajar directamnete como DTO o en el controller trasnformarlo
     se deben crear los dto  en este caso se  crearan aca
      el nombre de los metodos deben ser memo tecnicos de esta manera se crean los DTO DESDE EL PAQUETE DTO

      */

    List<DelitoDTO> findAll();

    DelitoDTO findById(Long id);

    DelitoDTO save(DelitoDTO delitoDTO);

    void delete(Long id);

}
