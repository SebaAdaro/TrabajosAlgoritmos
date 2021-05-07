package NuevoMovimientoDeCaballo;

import PilasYColas.DynamicStack;

public class Board {
    private Position[][] positions = new Position[8][8];
    private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private DynamicStack stackMovements = new DynamicStack();
    private DynamicStack testStack = new DynamicStack();

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                positions[i][j] = new Position(letters[i], j);
            }
        }
    }

    public Object makeNextMove(Position position) {
        DynamicStack stack = horseMove(position);
        for (int i = 0; i < stack.size(); i++) {
            testStack.stack(stack.peek());
            try {
                stack.pop();
            } catch (IsEmptyException e) {
                e.printStackTrace();
            }
        }
        return stack.peek();
    }

    public DynamicStack horseMove(Position position) {
        DynamicStack possiblePosition = new DynamicStack();

        int[] x = {-2, -1, 2, 2, 1, -1, -2, 1};
        int[] y = {1, 2, 1, -1, -2, -2, -1, 2};

        for (int i = 0; i < x.length; i++) {
            int X = getLetterIndex(position.getLetter()) + x[i];
            int Y = position.getNumber() + y[i];
            if (X > 0 && X < 8 && Y > 0 && Y < 8) {
                possiblePosition.stack(positions[X][Y]);
            }
        }
        return possiblePosition;
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

