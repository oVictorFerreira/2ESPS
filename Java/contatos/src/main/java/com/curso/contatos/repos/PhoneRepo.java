package com.curso.contatos.repos;

import com.curso.contatos.models.Phone;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepo extends CrudRepository<Phone, Integer> {
}
