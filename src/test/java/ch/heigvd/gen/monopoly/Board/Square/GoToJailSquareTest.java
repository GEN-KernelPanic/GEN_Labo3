package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Piece;
import ch.heigvd.gen.monopoly.Player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoToJailSquareTest {
    private static GoToJailSquare goToJailSquare;
    private static RegularSquare jail;
    private static Player player;

    @BeforeAll
    static void setUp() {
        jail = new RegularSquare("Jail");
        goToJailSquare = new GoToJailSquare(jail);
        player = new Player("Testing player", new Piece("Testing piece", new GoSquare()));
    }

    @Test
    void playerShouldGoToJailAfterLandedOnGoToJailSquare() {
        player.getPiece().setLocation(goToJailSquare);
        player.getPiece().getLocation().landedOn(player);
        assertEquals(player.getPiece().getLocation(), jail);
    }
}
