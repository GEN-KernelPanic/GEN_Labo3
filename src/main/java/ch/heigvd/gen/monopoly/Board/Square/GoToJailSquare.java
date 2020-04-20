package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Player;

public class GoToJailSquare extends Square {
    private Square jail;

    public GoToJailSquare(Square jail) {
        super("GoToJail");
        this.jail = jail;
    }

    @Override
    public void landedOn(Player p) {
        p.getPiece().setLocation(jail);
    }
}
