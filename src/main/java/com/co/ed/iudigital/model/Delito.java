package com.co.ed.iudigital.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "delitos")
public class Delito implements Serializable {

    private static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// Se le dice que es autoincrementable a la llave primaria, se le pasa la estrategia de auto
    private  Long id;

    @Column(name = "nombre", length = 45,nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;

    @ManyToOne(cascade = CascadeType.ALL) // por default: fetch = EAGER
    @JoinColumn(name = "usuarios_id")
    private  Usuario usuario;
    //anotacion de muchos a uno va la relacion de aca para usuario  ve a a tabla usuario para ver

//TODO: leer sobre las anotaciones en hibernate jpa

    public Delito() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
