package com.co.ed.iudigital.repository;

import com.co.ed.iudigital.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDelitoRepository  extends JpaRepository<Delito, Long> {
}
