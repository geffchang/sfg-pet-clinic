package com.chang.sfgpetclinic.services;

import java.util.Set;

import com.chang.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet owner);
	
	Set<Pet> finadAll();
}
