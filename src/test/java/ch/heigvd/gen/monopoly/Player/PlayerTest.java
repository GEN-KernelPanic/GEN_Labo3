package ch.heigvd.gen.monopoly.Player;

import ch.heigvd.gen.monopoly.Board.Square.GoSquare;
import ch.heigvd.gen.monopoly.Board.Square.IncomeTaxSquare;
import ch.heigvd.gen.monopoly.Board.Square.RegularSquare;
import ch.heigvd.gen.monopoly.Board.Square.Square;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    private static Player player;
    private static String playerName;
    private static Square playerLocation;
    private static Piece playerPiece;

    @BeforeAll
    static void setUp() {
        playerName = "test";
        playerLocation = new RegularSquare("Testing square");
        playerPiece = new Piece("Horse");
        player = getNewPlayer();
    }

    private static Player getNewPlayer() {
        return new Player(playerName, playerPiece, playerLocation);
    }

    @Test
    void aPlayerShouldHaveAName() {
        assertEquals(player.getName(), playerName);
    }

    @Test
    void aPlayerShouldHaveCorrectAttributesAfterConstruction() {
        setUp();
        assertEquals(player.toString(), playerName);
        assertEquals(player.getPiece().getName(), playerPiece.getName());
        assertEquals(player.getLocation().getName(), playerLocation.getName());
        assertEquals(player.getNetWorth(), 1500);
    }

    @Test
    void addingCashWorks() {
        player = getNewPlayer(); // player has 1500$
        int worth = player.getNetWorth();

        Square goSquare = new GoSquare();
        player.setLocation(goSquare);
        player.getLocation().landedOn(player);
        assertEquals(player.getNetWorth(), worth + 200);
    }

    @Test
    void addingNegativeCashThrowsException() {
        player = getNewPlayer(); // player has 1500$
        assertThrows(IllegalArgumentException.class, () -> {
            player.addCash(-1000);
        });
    }

    @Test
    void reducingCashWorks() {
        player = getNewPlayer(); // player has 1500$
        int worth = player.getNetWorth();
        player.reduceCash(100);
        assertEquals(player.getNetWorth(), worth - 100);
    }

    @Test
    void cantPutAPlayerInDebt() {
        player = getNewPlayer(); // player has 1500$
        assertThrows(IllegalArgumentException.class, () -> {
            player.reduceCash(-100000);
        });
    }

    @Test
    void aPlayerLandingOnAGoSquareShouldWin200$() {
        player = getNewPlayer(); // player has 1500$
        int worth = player.getNetWorth();

        Square goSquare = new GoSquare();
        player.setLocation(goSquare);
        player.getLocation().landedOn(player);
        assertEquals(player.getNetWorth(), worth + 200);
    }

    @Test
    void aRichPlayerLandingOnATaxSquareShouldLose200$() {
        player = getNewPlayer(); // player has 1500$
        player.addCash(8500); // player has 10'000$
        int worth = player.getNetWorth();

        Square IncomeTaxSquare = new IncomeTaxSquare();
        player.setLocation(IncomeTaxSquare);
        player.getLocation().landedOn(player);
        assertEquals(player.getNetWorth(), worth - 200);
    }

    @Test
    void aRichPlayerLandingOnATaxSquareShouldLose10Percent() {
        player = getNewPlayer(); // player has 1500$
        player.reduceCash(500); // player has 1000$
        int worth = player.getNetWorth();

        Square IncomeTaxSquare = new IncomeTaxSquare();
        player.setLocation(IncomeTaxSquare);
        player.getLocation().landedOn(player);
        assertEquals(player.getNetWorth(), worth - 0.1*worth);
    }
}
