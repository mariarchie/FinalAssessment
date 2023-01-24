package Java;

import java.util.ArrayList;

import Java.Beasts.Beast;

public class BeastFarm implements Farm<Beast> {

    ArrayList<Beast> beasts = new ArrayList<>();

    @Override
    public void addAnimal(Beast aBeast) {
        if (!beasts.contains(aBeast)) {
            beasts.add(aBeast);
        }
    }

    @Override
    public void deleteAnimal(Beast beast) {
        if (!beasts.isEmpty()) {
            beasts.remove(beast);
        }
    }

    public void showPets(ArrayList<Beast> beasts) {
        for (Beast beast : beasts) {
            System.out.println(beast.getId());
        }
    }

}
