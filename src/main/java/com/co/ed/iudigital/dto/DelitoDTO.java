package com.co.ed.iudigital.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
public class DelitoDTO implements Serializable{

    private static final long serialVersionUID = 7881809134395879209L;

    private Long id;

    @NotNull(message = "Nombre es obligatorio")
    private String nombre;

    private String descripcion;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
