package ch.heigvd.gen.monopoly.Board.Square;

import ch.heigvd.gen.monopoly.Player.Player;

public class IncomeTaxSquare extends Square {
    private static final int MAX_PENALITY = 200;
    private static final double MAX_PERCENT = 0.1;

    public IncomeTaxSquare() {
        super("Income tax");
    }

    @Override
    public void landedOn(Player p) {
        int tax = Math.min(MAX_PENALITY, (int)(p.getNetWorth() * MAX_PERCENT));
        p.reduceCash(tax);
        System.out.println(p.getName() + " paid " + tax + "$ in tax and now owns " + p.getNetWorth() + "$");
    }
}
