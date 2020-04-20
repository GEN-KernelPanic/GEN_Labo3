package ch.heigvd.gen.monopoly.Die;

import java.util.Random;

public class Die {
    private int faceValue;
    private static final int MAX_VALUE = 6;
    private Random random;

    public Die() {
        faceValue = 0;
        random = new Random();
    }

    public void roll() {
        faceValue = random.nextInt(MAX_VALUE) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Cette méthode permet d'obtenir la valeur max du dé
     *
     * @return La valeur max du dé
     */
    public int getMaxValue() {
        return MAX_VALUE;
    }
}
