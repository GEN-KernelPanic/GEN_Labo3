package ch.heigvd.gen.monopoly.Player;

import ch.heigvd.gen.monopoly.Board.Square.Square;

public class Piece {
    private String name;

    public Piece(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return getName();
    }
}
