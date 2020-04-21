package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.Board.Board;
import ch.heigvd.gen.monopoly.Die.Cup;
import ch.heigvd.gen.monopoly.Die.Die;
import ch.heigvd.gen.monopoly.Player.Piece;
import ch.heigvd.gen.monopoly.Player.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MonopolyGame {
    private static final int NUMBER_OF_TURNS = 20;
    private static final int NUMBER_OF_DICE = 2;
    private static List<String> pieceNames = Arrays.asList(
            "Car", "Shoe", "TV", "Dog", "Pingouin", "Shield", "Canon", "Horse");

    private final LinkedList<Player> players = new LinkedList<>();
    private final Cup cup = new Cup(NUMBER_OF_DICE);
    private final Board board;

    private int currentTurn;

    public MonopolyGame(String[] players) throws IllegalArgumentException {
        if (players.length < 2 || players.length > 8)
            throw new IllegalArgumentException("The number of players is invalid.");

        this.board = new Board();

        Collections.shuffle(pieceNames);
        int counter = -1;
        for (String playerName : players) {
            this.players.add(new Player(playerName, new Piece(pieceNames.get(++counter)), board.getSquares().get(0)));
        }
    }

    void playGame() {
        System.out.println("The game begins :\n");
        for (Player player : players) {
            System.out.println(player + " has the piece \"" + player.getPiece() + "\"");
        }
        System.out.println();

        for (currentTurn = 1; currentTurn <= NUMBER_OF_TURNS; ++currentTurn) {
            System.out.println("Turn " + currentTurn);

            for (Player player : players) {
                player.takeTurn(board, cup);
                System.out.println();
            }
        }

        System.out.println("** THE END **");
    }

    public static void main(String[] args) {
        MonopolyGame mg = new MonopolyGame(args);
        mg.playGame();
    }
}
