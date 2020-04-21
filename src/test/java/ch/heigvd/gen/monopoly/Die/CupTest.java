package ch.heigvd.gen.monopoly.Die;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {
    private Cup cup;
    private final int NUMBER_OF_DICE = 100;
    private final int MAX_FACE_VALUE = 6;

    @BeforeEach
    void setUp() {
        cup = new Cup(NUMBER_OF_DICE);
    }

    @RepeatedTest(50)
    void faceValueShouldBeBetweenNumDiceAndNumDiceTimesMaxValue() {
        cup.roll();
        assertTrue(cup.getTotal() >= NUMBER_OF_DICE && cup.getTotal() <= MAX_FACE_VALUE*NUMBER_OF_DICE);
    }
}
