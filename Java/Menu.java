package Java;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    // Метод, показывающий главное меню программы
    public static void showMainMenu() {
        System.out.println("Введи цифру необходимого тебе действия: \n" +
                "1. Показать весь питомник\n" +
                "2. Показать только выбранный вид животных\n" +
                "3. Увидеть список команд, которое выполняет животное\n" +
                "4. Обучить животное новым командам");
    }


    public static void printOnlyThisClass(Farm<Animal> animalFarm) {
        System.out.println("Выбери, какой вид животных ты хочешь увидеть: \n" +
                "1. Домашние\n" +
                "2. Вьючные");
        int userSelectedClass = scanner.nextInt();

        switch (userSelectedClass) {
            case 1:
                animalFarm.printOnlyThisClass(1);
                break;
            case 2:
                animalFarm.printOnlyThisClass(2);
                break;
        }
    }
}