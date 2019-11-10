package com.chang.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.chang.sfgpetclinic.model.PetType;
import com.chang.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	public Set<PetType> findAll() {
		return super.findAll();
	}
	
	public PetType findById(Long id) {
		return super.findById(id);
	}
	
	public PetType save(PetType object) {
		return super.save(object);
	}
	
	public void delete(PetType object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
