package ch.heigvd.gen.monopoly.Player;

import ch.heigvd.gen.monopoly.Board.Square;
import ch.heigvd.gen.monopoly.Player.Piece;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {
    private static Piece piece;
    private static String pieceName;

    @BeforeAll
    static void setUp() {
        pieceName = "test";
        piece = new Piece(pieceName, new Square("Go"));
    }

    @Test
    void aPieceShouldHaveAName() {
        assertEquals(piece.getName(), pieceName);
    }
}
