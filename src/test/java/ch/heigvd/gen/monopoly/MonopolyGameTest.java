package ch.heigvd.gen.monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonopolyGameTest {
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
}
