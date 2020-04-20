package ch.heigvd.gen.monopoly.Board;

import ch.heigvd.gen.monopoly.Board.Square.Square;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {
    private static Board board;

    @BeforeAll
    static void setUp() {
        board = new Board();
    }

    @Test
    void aBoardShouldHaveNSquares() {
        assertEquals(board.getSquares().size(), board.getNbrOfSquares());
    }

    @Test
    void squareNamesShouldFollowSpec() {
        int nbrOfSquares = board.getNbrOfSquares();

        String[] specNames = new String[nbrOfSquares];
        specNames[0] = "Go";
        for (int i = 1; i < nbrOfSquares; i++) {
            specNames[i] = "" + i;
        }
        specNames[4] = "Income tax";
        specNames[10] = "Jail";
        specNames[30] = "Go to jail";

        String[] effectiveNames = new String[nbrOfSquares];
        ArrayList<Square> squares = board.getSquares();
        for (int i = 0; i < squares.size(); i++) {
            effectiveNames[i] = squares.get(i).getName();
        }

        assertArrayEquals(specNames, effectiveNames);
    }

    @Test
    void getSquareShouldReturnCorrectSquare() {
        Square oldLocation = board.getSquares().get(13);
        Square newLocation = board.getSquare(oldLocation, 8);

        assertEquals(board.getSquares().get(21), newLocation);

        oldLocation = board.getSquares().get(37);
        newLocation = board.getSquare(oldLocation, 7);

        assertEquals(board.getSquares().get(4), newLocation);
    }
}