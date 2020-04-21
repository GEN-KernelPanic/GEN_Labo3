package ch.heigvd.gen.monopoly.Die;

import java.util.LinkedList;

public class Cup {

    private LinkedList<Die> dice = new LinkedList<>();
    private int totalFaceValue;

    public Cup(int numberOfDice) {
        for (int i = 0; i < numberOfDice; i++) {
            dice.add(new Die());
        }
    }

    public void roll() {
        totalFaceValue = 0;
        for (Die d: dice) {
            d.roll();
            totalFaceValue += d.getFaceValue();
        }
    }

    public int getTotal() {
        return totalFaceValue;
    }
}
