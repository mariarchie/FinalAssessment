package Java;

import Java.Beasts.Beast;
import Java.Pets.Pet;

public class Farm<T> {
    private List<T> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public boolean adopt(T animal) {
        return animals.add(animal);
    }

    public Farm<Animal> release(Farm<Animal> animalFarm) {
        if (animals.contains(animalFarm)) {
            animals.remove(animalFarm);
            return animalFarm;
        }
        return null;
    }

    public static <A> Farm<A> create() {
        return new Farm<A>();
    }

    public static <A> boolean adopt(Farm<A> farm, A animal) {
        return farm.adopt(animal);
    }

    public void printOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                printCollection(Pet.class);
                break;
            case 2:
                printCollection(Beast.class);
                break;
        }
    }

    public void printCollection(Class<?> choiseClass){
        for (T animal :
                animals) {
            if (choiseClass.isInstance(animal)) {
                System.out.println(animal.toString());
            }
        }
    }

    public static void printAnimals() {
        for (Animal animal :
                animals) {
            System.out.println(animal.toString());
        }
    }
}