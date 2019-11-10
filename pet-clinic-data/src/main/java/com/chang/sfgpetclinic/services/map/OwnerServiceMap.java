package com.chang.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.chang.sfgpetclinic.model.Owner;
import com.chang.sfgpetclinic.model.Pet;
import com.chang.sfgpetclinic.services.OwnerService;
import com.chang.sfgpetclinic.services.PetService;
import com.chang.sfgpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	
	private final PetService petService;
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}
	
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	public Owner save(Owner object) {
		
		if (null != object) {
			if (null != object.getPets()) {
				object.getPets().forEach(pet -> {
					if (null != pet.getPetType()) {
						if (null == pet.getPetType().getId()) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}
					
					if (null == pet.getId()) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);	
		} else {
			return null;
		}
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
