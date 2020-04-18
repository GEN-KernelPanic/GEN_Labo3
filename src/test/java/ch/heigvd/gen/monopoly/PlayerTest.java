package ch.heigvd.gen.monopoly;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private static Player player;
    private static String playerName;

    @BeforeAll
    static void setUp() {
        playerName = "test";
        player = new Player(playerName);
    }

    @Test
    void aSquareShouldHaveAName() {
        assertEquals(player.getName(), playerName);
    }
}
