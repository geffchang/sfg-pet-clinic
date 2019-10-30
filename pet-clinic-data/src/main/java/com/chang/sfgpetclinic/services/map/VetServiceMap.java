package com.chang.sfgpetclinic.services.map;

import java.util.Set;

import com.chang.sfgpetclinic.model.Vet;
import com.chang.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	
	public void delete(Vet object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
