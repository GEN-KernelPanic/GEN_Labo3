package ch.heigvd.gen.monopoly.Player;

import ch.heigvd.gen.monopoly.Board.Board;
import ch.heigvd.gen.monopoly.Die.Die;
import ch.heigvd.gen.monopoly.Board.Square.Square;

import java.util.LinkedList;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void takeTurn(Board board, LinkedList<Die> dice) {
        int score = 0;
        for (Die d: dice) {
            d.roll();
            score += d.getFaceValue();
        }

        System.out.println(this + " got a score of " + score);

        Square oldLocation = piece.getLocation();
        piece.setLocation(board.getSquare(oldLocation, score));

        System.out.println(this + " moves from \"" + oldLocation + "\" to \""
                + piece.getLocation()+ "\"");
    }
}
