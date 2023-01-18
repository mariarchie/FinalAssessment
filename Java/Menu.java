package Java;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    // Метод, показывающий главное меню программы
    public void showMainMenu() {
        System.out.println("Введи цифру необходимого тебе действия: \n" +
                "1. Показать весь питомник\n" +
                "2. Показать только выбранный вид животных\n" +
                "3. Увидеть список команд, которое выполняет животное\n" +
                "4. Обучить животное новым командам");
    }

    // Метод, который показывает только определенный класс животного
    // номер которого ввел пользователь
    // 1 - Домашние
    // 2 - Вьючные

    public void printOnlyThisClass(Farm<Animal> animalFarm) {
        System.out.println("Выбери, какой вид животных ты хочешь увидеть: \n" +
                "1. Домашние\n" +
                "2. Вьючные");
        int userSelectedClass = scanner.nextInt();
        // В зависимости от выбора пользователя, прокидываем в метод
        // число, соответствующее определенному классу животного
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