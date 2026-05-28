package com.curso.GS2026.repositories;

import com.curso.GS2026.models.Material;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Integer> {
}
