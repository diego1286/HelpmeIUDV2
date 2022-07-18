package com.co.ed.iudigital.model;

import javax.persistence.*;
import java.io.Serializable;
// se debe anotar con entity para convertir la tabla en un bean de spring, luego la anotacion de table para mapear la tabla en bd
@Entity
@Table(name = "roles")
public class Role implements Serializable {


    private static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// Se le dice que es autoincrementable a la llave primaria, se le pasa la estrategia de auto
    private  Long id;

    @Column(name = "nombre", length = 45, nullable = false)// se hace la anotacion colunm cuando el nombre no es igual al de la bd y demas propiedades
    private String nombre;

    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;

    public Role() {
    }
    /*
    se deben crear los get y set para poder obtener los valores que se quieren esto por el encapsulamiento de POO tambien creer el constructor
    vacio para poder crear el objeto instanciado cuando se quiera crear
     */

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
