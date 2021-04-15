package NuevoMovimientoDeCaballo;

import PilasYColas.DinamicStack;
import PilasYColas.IsEmptyException;

public class Board {
    private int movement;
    private Object[] array;
    private Position[][] positions = new Position[8][8];
    public String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private DinamicStack stackBoard;

    public Board() {
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions[i].length; j++) {
                positions[i][j] = new Position(letters[i], j);
            }
        }
    }
    //hola

    public Object makeNextMove(Position position) throws IsEmptyException {
        DinamicStack pila = horseMove(position);
        Object position1 = pila.peek();

        try {
            array[movement] = position1;
            movement++;
            pila.pop();

        } catch (IsEmptyException e) {
            e.getMessage();
        }
        return position1;
    }


    public void showStack() {
        StringBuilder track = new StringBuilder(" " + "_ " + " ");
        for (int i = 0; i < array.length; i++) {
            track.append(array[i]);
        }
        System.out.println(track);
    }

    public DinamicStack horseMove(Position position) {

        int[] x = {1, -1, 2, 2, 1, -1, -2, -2};
        int[] y = {2, 2, 1, -1, -2, -2, -1, 1};

        for (int i = 0; i < 8; i++) {
            int X = getLetterIndex(position.getLetter()) + x[i];
            int Y = position.getNumber() + y[i];
            if (X >= 0 && X <= 7 && Y >= 0 && Y <= 7) {
                stackBoard.stack(positions[X][Y]);
            }
        }
        return stackBoard;
    }

    private int getLetterIndex(String letter) {
        int index = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letter.equals(letters[i])) {
                index = i;
            }
        }
        return index;
    }
}

