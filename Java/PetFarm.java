package Java;

import java.util.ArrayList;

import Java.Pets.Pet;

public class PetFarm implements Farm<Pet> {

    ArrayList<Pet> pets = new ArrayList<>();

    @Override
    public void addAnimal(Pet aPet) {
        if (!pets.contains(aPet)) {
            pets.add(aPet);
        }
    }

}
