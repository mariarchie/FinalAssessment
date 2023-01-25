package JAVA.Pets;

import JAVA.AnimalEnum;

public class Cat extends Pet {
    boolean houseLiver;

    public Cat(int id, String name, String birthdate, AnimalEnum type, boolean thoroughbred) {
        super(id, name, birthdate, type, thoroughbred);

    }
}
