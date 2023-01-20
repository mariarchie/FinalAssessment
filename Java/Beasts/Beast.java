package Java.Beasts;

import java.util.ArrayList;

import Java.Animal;

public class Beast extends Animal implements Employable {
    private int loadCapacity;

    public Beast(int id, String name, String birthdate, int loadCapacity) {
        super(id, name, birthdate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void employ() {
        // TODO Auto-generated method stub
    }

    @Override
    public void addCommand(String command, Animal animal) {
        super.addCommand(command, animal);
    }

    @Override
    public void showCommands(ArrayList<String> commands) {
        super.showCommands(commands);
    }

    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\nГрузоподъемность: %s\n", getId(), getName(), getBirthdate(),
                this.loadCapacity);
    }
}
