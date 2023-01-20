package Java;

import java.util.Scanner;

import Java.Beasts.Beast;
import Java.Pets.Pet;

public class Menu {
    static void showMainMenu() {
        System.out.println(
                "Welcome to the Pets and Beasts Cattery" + "\n" +
                        "Выберите действие:" + "\n"
                        + "1. Завести новое животное" + "\n"
                        + "2. Увидеть список команд, которое выполняет животное" + "\n"
                        + "3. Обучить животное новым командам" + "\n"
                        + "4. Выйти" + "\n");
    }

    void start() {

        boolean end = false;

        while (!end) {
            showMainMenu();
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println(
                        "Введите тип животного:" + "\n"
                                + "1. Домашние" + "\n"
                                + "2. Вьючные" + "\n");
                int chooseType = sc.nextInt();
                if (chooseType == 1) {
                    System.out.println("Введите id животного: ");
                    int id = sc.nextInt();
                    System.out.println("Введите имя животного: ");
                    String name = sc.next();
                    System.out.println("Введите дату рождения(YYYY-MM-DD): ");
                    String birthdate = sc.next();
                    System.out.println("Животное является породистым?(True/False) ");
                    boolean thoroughbred = sc.nextBoolean();
                    Pet aPet = new Pet(id, name, birthdate, thoroughbred);
                    System.out.println(aPet);
                }
                if (chooseType == 2) {
                    System.out.println("Введите id животного: ");
                    int id = sc.nextInt();
                    System.out.println("Введите имя животного:");
                    String name = sc.next();
                    System.out.println("Введите дату рождения(YYYY-MM-DD): ");
                    String birthdate = sc.next();
                    System.out.println("Введите грузоподъемность животного(kg): ");
                    int loadCapacity = sc.nextInt();
                    Beast aBeast = new Beast(id, name, birthdate, loadCapacity);
                    System.out.println(aBeast);
                }

            } else if (input == 2) {
                System.out.println("Команды какого животного Вы желаете посмотреть?(Введите id)");
                int id = sc.nextInt();
                System.out.println(
                        "Выберите тип животного:" + "\n"
                                + "1. Домашние" + "\n"
                                + "2. Вьючные" + "\n");
                int chooseType = sc.nextInt();
                if (chooseType == 1) {
                    PetStorage storage = new PetStorage();
                    for (int i = 0; i < storage.pets.size(); i++) {
                        if (storage.pets.get(i).getId() == id) {
                            storage.pets.get(i).showCommands(storage.pets.get(i).commands);
                        }
                    }
                }
                if (chooseType == 2) {
                    BeastStorage storage = new BeastStorage();
                    for (int i = 0; i < storage.beasts.size(); i++) {
                        if (storage.beasts.get(i).getId() == id) {
                            storage.beasts.get(i).showCommands(storage.beasts.get(i).commands);
                        }
                    }
                }

            } else if (input == 3) {
                System.out.println("Введите id животного, которого будем обучать команде: ");
                int animalID = sc.nextInt();

                System.out.println("Какой команде будем обучать животное? ");
                String inputCommand = sc.next();
                System.out.println(
                        "Выберите тип животного:" + "\n"
                                + "1. Домашние" + "\n"
                                + "2. Вьючные" + "\n");
                int animalType = sc.nextInt();
                if (animalType == 1) {
                    PetStorage storage = new PetStorage();
                    for (int i = 0; i < storage.pets.size(); i++) {
                        if (storage.pets.get(i).getId() == animalID) {
                            storage.pets.get(i).addCommand(inputCommand, ((Animal) (storage.pets.get(i))));
                        }
                    }
                }
                if (animalType == 2) {
                    BeastStorage storage = new BeastStorage();
                    for (int i = 0; i < storage.beasts.size(); i++) {
                        if (storage.beasts.get(i).getId() == animalID) {
                            storage.beasts.get(i).addCommand(inputCommand, ((Animal) (storage.beasts.get(i))));
                        }
                    }
                }

            } else if (input == 4) {
                end = true;
                sc.close();
            } else {
                end = true;
                sc.close();
            }
        }
    }
}
