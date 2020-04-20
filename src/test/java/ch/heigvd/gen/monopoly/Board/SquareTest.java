package ch.heigvd.gen.monopoly.Board;

import ch.heigvd.gen.monopoly.Board.Square;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    private static Square square;
    private static String squareName;

    @BeforeAll
    static void setUp() {
        squareName = "test";
        square = new Square(squareName);
    }

    @Test
    void aSquareShouldHaveAName() {
        assertEquals(square.getName(), squareName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Square", "Not a square", "Just a name", "This is test", "Hello"})
    void aSquareShouldHaveTheCorrectName(String name) {
        Square square = new Square(name);
        assertEquals(square.getName(), name);
    }
}
