package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Piece;
import ch.heigvd.gen.monopoly.Player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IncomeTaxSquareTest {
    private static IncomeTaxSquare incomeTaxSquare;
    private static Player player;

    @BeforeEach
    void initPlayer() {
        player = new Player("Testing player", new Piece("Testing piece"), new GoSquare());
    }

    @BeforeAll
    static void setUp() {
        incomeTaxSquare = new IncomeTaxSquare();
    }
}
