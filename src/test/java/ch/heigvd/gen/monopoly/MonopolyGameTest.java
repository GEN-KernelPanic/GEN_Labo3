package ch.heigvd.gen.monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonopolyGameTest {
    private String[] players = {"Jaques", "Alberte", "Matthieu", "Philibert", "Clarisse"};

    @Test
    public void numberOfPlayerShouldBeValid() {
        String[] notEnough = new String[1];
        String[] tooMuch = new String[10];

        assertThrows(IllegalArgumentException.class, () -> {
            new MonopolyGame(notEnough);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new MonopolyGame(tooMuch);
        });
    }

    @Test
    public void gameSimulation() {
        MonopolyGame mg = new MonopolyGame(players);
        mg.playGame();
    }
}
