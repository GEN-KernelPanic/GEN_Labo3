package ch.heigvd.gen.monopoly.Player;

import ch.heigvd.gen.monopoly.Board.Board;
import ch.heigvd.gen.monopoly.Die.Cup;
import ch.heigvd.gen.monopoly.Die.Die;
import ch.heigvd.gen.monopoly.Board.Square.Square;

import java.util.LinkedList;

public class Player {
    private String name;
    private int cash;
    private Piece piece;
    private Square location;

    public Player(String name, Piece piece, Square location) {
        this.name = name;
        this.cash = 1500;
        this.piece = piece;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square newLocation) {
        location = newLocation;
    }

    public int getNetWorth() { return cash; }

    public void addCash(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can't add negative money to a player");
        }
        cash += amount;
    }

    public void reduceCash(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can't remove negative money from a player");
        } else if (amount > cash) {
            throw new IllegalArgumentException("Players can't go into debt");
        }
        cash -= amount;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void takeTurn(Board board, Cup cup) {
        cup.roll();
        int score = cup.getTotal();

        System.out.println(this + " got a score of " + score);

        Square oldLocation = getLocation();
        Square newLocation = board.getSquare(oldLocation, score);

        System.out.println(this + " moves from \"" + oldLocation + "\" to \""
                + newLocation + "\"");

        setLocation(newLocation);
        getLocation().landedOn(this);
    }
}
