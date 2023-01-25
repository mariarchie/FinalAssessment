package JAVA;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                Menu menu = new Menu();
                menu.start();
            }
        } catch (Exception e) {
            System.out.println("Come back soon");
        }
    }
}
