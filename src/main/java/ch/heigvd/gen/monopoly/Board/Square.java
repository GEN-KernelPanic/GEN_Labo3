package ch.heigvd.gen.monopoly.Board;

public class Square {
    private String name;

    public Square(String name) {
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
