package com.co.ed.iudigital.controller;


import java.util.List;

import com.co.ed.iudigital.dto.DelitoDTO;
import com.co.ed.iudigital.service.IDelitoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/delitos")
public class DelitoController {

    private static final Logger log =
            LoggerFactory.getLogger(DelitoController.class);

    @Autowired
    private IDelitoService delitoService;

    @GetMapping
    public ResponseEntity<List<DelitoDTO>> index(){
        log.info("se consultan todos los delitos");
        List<DelitoDTO> delitos = delitoService.findAll();
        return ResponseEntity.ok(delitos);
    }
}


