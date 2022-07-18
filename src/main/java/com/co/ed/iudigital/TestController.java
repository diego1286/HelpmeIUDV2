package com.co.ed.iudigital;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")// url para poder mapear la ruta de la aplicacion
public class TestController {

    @GetMapping// aca no es necesario poner una url ya que la tiene el papa que es la clase tescontroller
    public ResponseEntity<String> test(){
        return ResponseEntity.ok().body("coreecto le pegaste a donde es!!!!!!!!!");
        // se crea el metodo responseEntity que regrea un string  en forma de json  con el body que se le envie
        // por parametro esta parte esta en la clase del diplomado del 13/07/2022 del diplomado 2022 desde ahi inician la aplicacion spring
        // esto crea el empoint donde se coencta como punto final a la aplicacion
    }
}
/*
esta clase es controladora se anota con la anotacion rescontroller de spring para obligar a la creacion del
bean, luego se hace el requestmaping para mandarle a donde se quiere enviar
 */