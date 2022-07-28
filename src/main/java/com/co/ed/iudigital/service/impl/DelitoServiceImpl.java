package com.co.ed.iudigital.service.impl;


import com.co.ed.iudigital.dto.DelitoDTO;
import com.co.ed.iudigital.model.Delito;
import com.co.ed.iudigital.repository.IDelitoRepository;
import com.co.ed.iudigital.service.IDelitoService;
import com.co.ed.iudigital.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DelitoServiceImpl
        implements IDelitoService {

    @Autowired
    private IDelitoRepository delitoRepository;

    @Override
    public List<DelitoDTO> findAll() {
        List<Delito> delitos = delitoRepository.findAll();
        List<DelitoDTO> delitosDTO =
                Helper.convertListDelitoDTO(delitos);
        return delitosDTO;
    }

    @Override
    public DelitoDTO findById(Long id) {
        return null;
    }

    @Override
    public DelitoDTO save(DelitoDTO delitoDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

}

