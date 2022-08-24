package com.sohail.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sohail.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
