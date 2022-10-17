package com.example.pcm.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.pcm.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Integer>{

}
