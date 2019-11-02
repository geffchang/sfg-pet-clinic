package com.chang.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.chang.sfgpetclinic.model.Vet;
import com.chang.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	public Vet save(Vet object) {
		return super.save(object);
	}
	
	public void delete(Vet object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
