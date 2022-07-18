package com.co.ed.iudigital.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "casos")
public class Caso implements Serializable {

    private static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDate fechaHora;




    /*
    fecha_hora DATETIME NULL DEFAULT now(),
    latitud FLOAT NULL,
    longitud FLOAT NULL,
    altitud FLOAT NULL,
    visible TINYINT NULL DEFAULT 1,
    descripcion VARCHAR(200) NULL,
    url_map TEXT NULL,
    rmi_url TEXT NULL,
    usuarios_id INT NOT NULL,
    delitos_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (usuarios_id) REFERENCES usuarios(id),
    FOREIGN KEY (delitos_id) REFERENCES delitos(id)
    );
     */


}
