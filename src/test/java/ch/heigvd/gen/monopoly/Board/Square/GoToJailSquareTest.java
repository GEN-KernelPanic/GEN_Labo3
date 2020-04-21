package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Piece;
import ch.heigvd.gen.monopoly.Player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoToJailSquareTest {
    private static GoToJailSquare goToJailSquare;
    private static RegularSquare jail;
    private static Player player;

    @BeforeAll
    static void setUp() {
        jail = new RegularSquare("Jail");
        goToJailSquare = new GoToJailSquare(jail);
        player = new Player("Testing player", new Piece("Testing piece"), new GoSquare());
    }

    @Test
    void playerShouldGoToJailAfterLandedOnGoToJailSquare() {
        player.setLocation(goToJailSquare);
        player.getLocation().landedOn(player);
        assertEquals(player.getLocation(), jail);
    }

    @Test
    void aGoToJailSquareShouldHaveTheCorrectName() {
        String expectedName = "Go to jail";
        assertTrue(expectedName.equals(goToJailSquare.getName()));
    }
}
