package com.chang.sfgpetclinic.services;

import java.util.Set;

import com.chang.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet owner);
	
	Set<Vet> finadAll();
}
