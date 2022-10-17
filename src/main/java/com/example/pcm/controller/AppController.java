package com.example.pcm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pcm.model.Pet;
import com.example.pcm.model.Response;
import com.example.pcm.repository.PetRepository;

@RestController
@RequestMapping("/app")
public class AppController {
	@Autowired
	PetRepository repository;
	
	@PostMapping("/add")
	public Response addPet(@RequestParam String petname,@RequestParam String petowner,@RequestParam String reason) {
		Pet pet = new Pet(null,petname,petowner,reason);
		repository.save(pet);
		Response response = new Response(101, petname+  " Added Successfully ");
		return response;
	}
	
	@GetMapping("/list")

	public Response listPet() { 
		
		List<Pet> petList= new ArrayList<Pet>();
		repository.findAll().forEach((pet)->petList.add(pet));
		Response response = new Response(101,"A total of"  +petList.size()+  "pets fetched");
		return response;
	

				
	}


}