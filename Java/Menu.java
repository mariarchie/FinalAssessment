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
                        + "4. Выйти");
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
                                + "2. Вьючные");
                int type = sc.nextInt();
                if (type == 1) {
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
                if (type == 2) {
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
            }

            if (input == 2) {
                System.out.println("Команды какого животного Вы желаете посмотреть?(Введите id)");
                int animalId = sc.nextInt();
                PetFarm pstorage = new PetFarm();
                for (int i = 0; i < pstorage.pets.size(); i++) {
                    if (pstorage.pets.get(i).getId() == animalId) {
                        pstorage.pets.get(i).showCommands(pstorage.pets.get(i).commands);
                    }
                }
                BeastFarm bstorage = new BeastFarm();
                for (int i = 0; i < bstorage.beasts.size(); i++) {
                    if (bstorage.beasts.get(i).getId() == animalId) {
                        bstorage.beasts.get(i).showCommands(bstorage.beasts.get(i).commands);
                    }
                }
            }

            if (input == 3) {
                System.out.println("Какого животного будем обучать?(Введите id) ");
                int animalID = sc.nextInt();

                System.out.println("Какой команде будем обучать животное? ");
                String inputCommand = sc.next();

                PetFarm ptstorage = new PetFarm();
                for (int i = 0; i < ptstorage.pets.size(); i++) {
                    if (ptstorage.pets.get(i).getId() == animalID) {
                        ptstorage.pets.get(i).addCommand(inputCommand, ((Animal) (ptstorage.pets.get(i))));
                    }
                }

                BeastFarm bststorage = new BeastFarm();
                for (int i = 0; i < bststorage.beasts.size(); i++) {
                    if (bststorage.beasts.get(i).getId() == animalID) {
                        bststorage.beasts.get(i).addCommand(inputCommand, ((Animal) (bststorage.beasts.get(i))));
                    }
                }
            }

            if (input == 4) {
                end = true;
                sc.close();

            } else {
                end = true;
                System.out.println("Wrong number");
                sc.close();
            }

        }
    }
}
