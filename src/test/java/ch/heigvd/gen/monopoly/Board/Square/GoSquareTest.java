package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Piece;
import ch.heigvd.gen.monopoly.Player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoSquareTest {
    private static GoSquare goSquare;
    private static Player player;

    @BeforeAll
    static void setUp() {
        goSquare = new GoSquare();
        player = new Player("Testing player", new Piece("Testing piece"), new GoSquare());
    }

    @Test
    void aGoSquareShouldHaveTheCorrectName() {
        String go = "Go";
        assertTrue(go.equals(goSquare.getName()));
    }
}
