package com.example.sfgpetclinic.bootstrap;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.OwnerService;
import com.example.sfgpetclinic.services.PetService;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("hello1");
        owner1.setLastName("world1");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("hello2");
        owner2.setLastName("world2");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("hello1");
        vet1.setLastName("world1");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("hello2");
        vet2.setLastName("world2");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
