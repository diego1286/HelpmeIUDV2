package com.co.ed.iudigital.repository;

import com.co.ed.iudigital.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICasoRepository extends JpaRepository<Caso, Long> {

    @Query("UPDATE Caso c SET c.visible = ?1 WHERE "
            + "c.id = ?2")// SE HACE LA CONSULTA CON SQL
    Boolean setVisible(Boolean visible, Long id);


}
