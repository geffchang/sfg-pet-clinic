package com.chang.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.chang.sfgpetclinic.model.Owner;
import com.chang.sfgpetclinic.model.Pet;
import com.chang.sfgpetclinic.model.PetType;
import com.chang.sfgpetclinic.model.Vet;
import com.chang.sfgpetclinic.services.OwnerService;
import com.chang.sfgpetclinic.services.PetTypeService;
import com.chang.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	
	private final VetService vetService;
	
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Owner1");
		owner1.setLastName("Last1");
		owner1.setAddress("123 Alpha");
		owner1.setCity("Cebu City");
		owner1.setTelephone("1234567");
		
		Pet owner1Pet = new Pet();
		owner1Pet.setPetType(savedDogPetType);
		owner1Pet.setOwner(owner1);
		owner1Pet.setBirthDate(LocalDate.now());
		owner1Pet.setName("owner1Pet");
		owner1.getPets().add(owner1Pet);
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Owner2");
		owner2.setLastName("Last2");
		owner2.setAddress("456 Bravo");
		owner2.setCity("Mandaue City");
		owner2.setTelephone("2345678");
		
		Pet owner2Pet = new Pet();
		owner2Pet.setPetType(savedCatPetType);
		owner2Pet.setOwner(owner2);
		owner2Pet.setBirthDate(LocalDate.now());
		owner2Pet.setName("owner2Pet");
		owner2.getPets().add(owner2Pet);
		
		ownerService.save(owner2);
		
		System.out.println("Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Vet1");
		vet1.setLastName("Last1");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Vet2");
		vet2.setLastName("Last2");
		
		vetService.save(vet2);
		
		System.out.println("Vets...");
	}

	
}
