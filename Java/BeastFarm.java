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

}
