package JAVA;

import java.util.ArrayList;

import JAVA.Pets.Pet;

public class PetFarm implements Farm<Pet> {

    ArrayList<Pet> pets = new ArrayList<>();

    @Override
    public void addAnimal(Pet aPet) {
        if (!pets.contains(aPet)) {
            pets.add(aPet);
        }
    }

    @Override
    public void deleteAnimal(Pet aPet) {
        if (!pets.isEmpty()) {
            pets.remove(aPet);
        }
    }
}
