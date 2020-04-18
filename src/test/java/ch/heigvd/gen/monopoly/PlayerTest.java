package ch.heigvd.gen.monopoly;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private static Player player;
    private static String playerName;
    private static Square playerLocation;
    private static Piece playerPiece;

    @BeforeAll
    static void setUp() {
        playerName = "test";
        playerLocation = new Square("Go");
        playerPiece = new Piece("Horse", playerLocation);
        player = new Player(playerName, playerPiece);
    }

    @Test
    void aPlayerShouldHaveAName() {
        assertEquals(player.getName(), playerName);
    }

    @Test
    void aPlayerShouldHaveCorrectAttributesAfterConstruction() {
        assertEquals(player.toString(), playerName);
        assertEquals(player.getPiece().getName(), playerPiece.getName());
        assertEquals(player.getPiece().getLocation().getName(), playerLocation.getName());
    }
}
