package Java;

import java.util.ArrayList;

import Java.Pets.Pet;

public class PetStorage implements Storage<Pet> {

    ArrayList<Pet> pets = new ArrayList<>();

    @Override
    public void addAnimal(Pet aPet) {
        if (!pets.contains(aPet)) {
            pets.add(aPet);
        }
    }

    @Override
    public void deleteAnimal(Pet pet) {
        if (!pets.isEmpty()) {
            pets.remove(pet);
        }
    }

    public void showPets(ArrayList<Pet> pets) {
        for (Pet pet : pets) {
            System.out.println(pet.getId());
        }
    }

}
