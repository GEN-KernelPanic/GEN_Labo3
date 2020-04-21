package ch.heigvd.gen.monopoly.Board.Square;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularSquareTest {
    private static RegularSquare square;
    private static String squareName;

    @BeforeAll
    static void setUp() {
        squareName = "Testing square";
        square = new RegularSquare(squareName);
    }

    @Test
    void aSquareShouldHaveAName() {
        assertEquals(square.getName(), squareName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Square", "Not a Square", "Just a name", "This is test", "Hello"})
    void aSquareShouldHaveTheCorrectName(String name) {
        RegularSquare square = new RegularSquare(name);
        assertEquals(square.getName(), name);
    }
}
