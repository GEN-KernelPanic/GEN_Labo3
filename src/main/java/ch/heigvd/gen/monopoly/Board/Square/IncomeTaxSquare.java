package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Player;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare() {
        super("Income tax");
    }

    @Override
    public void landedOn(Player p) {
        // TODO : reduce the player's cash
    }
}
