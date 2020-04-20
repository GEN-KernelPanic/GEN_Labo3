package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Player;

public class GoSquare extends Square {
    private static final int REWARD = 200;

    public GoSquare() {
        super("Go");
    }

    @Override
    public void landedOn(Player p) {
        //TODO : Add $200 to the player
    }
}
