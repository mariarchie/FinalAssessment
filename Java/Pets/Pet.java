package Java.Pets;

import java.util.ArrayList;

import Java.Animal;

public class Pet extends Animal implements Playable {
    boolean thoroughbred;

    public Pet(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate);
        this.thoroughbred = thoroughbred;
    }

    public boolean getThoroughbred() {
        return thoroughbred;
    }

    public void setThoroughbred(boolean thoroughbred) {
        this.thoroughbred = thoroughbred;
    }

    @Override
    public void play() {
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
        return String.format("id: %d\nName: %s\nРожден: %s\nПородистый: %s\n", getId(), getName(), getBirthdate(),
                this.thoroughbred);
    }
}