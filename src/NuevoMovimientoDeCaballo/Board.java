package NuevoMovimientoDeCaballo;

import PilasYColas.DinamicStack;
import PilasYColas.IsEmptyException;

public class Board {
    private int movement = 0;
    private DinamicStack stackMovements = new DinamicStack();
    private Position[][] positions = new Position[8][8];
    public String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private DinamicStack stackBoard;

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                positions[i][j] = new Position(letters[i], j);
            }
        }
    }

    public Object makeNextMove(Position position) {
        DinamicStack stack = horseMove(position);
        stackMovements.stack(horseMove(position));
        Object position1 = stack.peek();
        try {
            stack.pop();
        } catch (IsEmptyException e) {
            e.getMessage();
        }
        return position1;
    }

    public String showStack() throws IsEmptyException {
        String text = "-";
        for (int i = 0; i < stackMovements.size(); i++) {
            text += stackMovements.peek() + "-";
            stackMovements.pop();
        }
        return text;
    }
//
//    public void showStack() {
//        String track = "";
//        for (int i = 0; i < array.length; i++) {
//            track += array[i] + " - ";
//        }
//        System.out.println(track);
//    }

    public DinamicStack horseMove(Position position) {

        int[] x = {1, -1, 2, 2, 1, -1, -2, -2};
        int[] y = {2, 2, 1, -1, -2, -2, -1, 1};

        for (int i = 0; i < 8; i++) {
            int X = getLetterIndex(position.getLetter()) + x[i];
            int Y = position.getNumber() + y[i];
            if (X > 0 && X < 8 && Y > 0 && Y < 8) {
                stackBoard.stack(positions[X][Y]);
            }
        }
        return stackBoard;
    }

    private int getLetterIndex(String letter) {
        int index = 0;
        for (int i = 0; i < 8; i++) {
            if (letter.equals(letters[i])) {
                index = i;
            }
        }
        return index;
    }
}

