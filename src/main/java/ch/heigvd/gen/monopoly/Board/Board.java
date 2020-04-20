package ch.heigvd.gen.monopoly.Board;

import ch.heigvd.gen.monopoly.Board.Square.*;

import java.util.ArrayList;

public class Board {
    private final static int NBR_OF_SQUARES = 40;
    private ArrayList<Square> squares = new ArrayList<>();

    public Board() {
        squares.add(new GoSquare());

        for (int i = 1; i < NBR_OF_SQUARES; i++) {
            squares.add(new RegularSquare("" + i));
        }

        squares.set(10, new RegularSquare("Jail"));
        squares.set(30, new GoToJailSquare(squares.get(10)));
        squares.set(4, new IncomeTaxSquare());
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public int getNbrOfSquares() {
        return NBR_OF_SQUARES;
    }

    public Square getSquare(Square oldLocation, int movement) {
        return squares.get((squares.indexOf(oldLocation) + movement) % NBR_OF_SQUARES);
    }
}
