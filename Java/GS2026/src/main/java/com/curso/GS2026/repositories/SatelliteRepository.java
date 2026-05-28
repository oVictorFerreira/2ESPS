package com.curso.GS2026.repositories;

import com.curso.GS2026.models.Satellite;
import com.curso.GS2026.models.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SatelliteRepository extends CrudRepository<Satellite, Long> {

    List<Satellite> findByOperator_OperatorId(Integer operatorId);

    List<Satellite> findByStatus(Status status);
}
