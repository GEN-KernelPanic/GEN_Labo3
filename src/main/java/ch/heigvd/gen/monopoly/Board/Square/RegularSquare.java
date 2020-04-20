package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Player;

public class RegularSquare extends Square {
    public RegularSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        // Nothing needs to be done here
    }
}
