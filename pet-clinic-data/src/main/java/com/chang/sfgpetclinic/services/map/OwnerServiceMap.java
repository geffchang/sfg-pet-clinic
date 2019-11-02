package com.chang.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.chang.sfgpetclinic.model.Owner;
import com.chang.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	public Owner save(Owner object) {
		return super.save(object);
	}
	
	public void delete(Owner object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}
