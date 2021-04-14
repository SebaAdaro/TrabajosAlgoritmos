package NuevoMovimientoDeCaballo;

public class Position {
    private String letter;
    private int number;

    public Position(String letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public String toString() {
        return letter + number + " ";
    }

    public String getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }
}
