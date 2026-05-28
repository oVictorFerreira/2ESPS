package com.curso.GS2026.repositories;

import com.curso.GS2026.models.MaterialType;
import com.curso.GS2026.models.SatelliteMaterial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SatelliteMaterialRepository extends CrudRepository<SatelliteMaterial, Integer> {

    List<SatelliteMaterial> findByMaterial_MaterialType(MaterialType materialType);

    List<SatelliteMaterial> findBySatellite_NoradId(Long noradId);

}
