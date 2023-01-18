package Java;

import java.util.Scanner;

import Java.Beasts.Camel;
import Java.Beasts.Donkey;
import Java.Pets.Cat;
import Java.Pets.Dog;

public class Main {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();

        animalFarm.adopt(new Cat(1009, "Джимбо", "2009-12-12", true));
        animalFarm.adopt(new Donkey(1019, "Дон", "2019-01-12", 12));
        animalFarm.adopt(new Camel(1091, "Крем", "2016-07-15", 15));
        animalFarm.adopt(new Dog(1209, "Рекс", "2018-07-15", false));

        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            Farm.printAnimals();
                            break;
                        case 2:
                            Menu.printOnlyThisClass(animalFarm);
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Try one more time");
        }
    }

}
