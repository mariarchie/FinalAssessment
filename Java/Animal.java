package Java;

import java.util.ArrayList;

public class Animal {

    private int id;
    private String name;
    private String birthdate;
    public ArrayList<String> commands = new ArrayList<>();

    public Animal(int id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String setBirthdate(String birthdate) {
        return this.birthdate = birthdate;
    }

    public void feed() {
        System.out.println(name + " сыт.");
    }

    public void addCommand(String command, Animal animal) {
        if (!animal.commands.contains(command)) {
            animal.commands.add(command);
        }
    }

    public void showCommands(ArrayList<String>commands) {
        for (String command: commands) {
            System.out.println(command);
        }
    }

    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\n", this.id, this.name, this.birthdate);

    }
}