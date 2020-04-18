package ch.heigvd.gen.monopoly;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MonopolyGame {
    private List<String> pieceNames = Arrays.asList(
            "Car", "Shoe", "TV", "Dog", "Pingouin", "Shiel", "Canon", "Horse");
    private final LinkedList<Player> players = new LinkedList<>();
    private final LinkedList<Die> dice = new LinkedList<>();
    private final Board board;

    public MonopolyGame(String[] players) throws IllegalArgumentException {
        if (players.length < 2 || players.length > 8)
            throw new IllegalArgumentException("The number of players is invalid.");

        this.board = new Board();
        this.dice.add(new Die());
        this.dice.add(new Die());

        Collections.shuffle(pieceNames);
        int counter = -1;
        for (String playerName : players) {
            this.players.add(new Player(playerName, new Piece(pieceNames.get(++counter), board.getSquares().get(0))));
        }
    }
}
