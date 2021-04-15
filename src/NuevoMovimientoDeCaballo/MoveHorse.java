package NuevoMovimientoDeCaballo;

import PilasYColas.IsEmptyException;
import PilasYColas.DynamicStack;

public class MoveHorse {
    private Board chessTable;
    private Position startingPosition;
    private int numberOfMoves;

    public MoveHorse(int numberOfMoves, Position startingPosition) {
        this.chessTable = new Board();
        this.startingPosition = startingPosition;
        this.numberOfMoves = numberOfMoves;
    }

    public void play() {
        DynamicStack firstMoves = chessTable.horseMove(startingPosition);

        fillStacks(firstMoves, 1, startingPosition.toString() + "-- ");
    }

    public void fillStacks(DynamicStack stack, int currentMove, String currentPos) {
        Position pos;
        while (!stack.isEmpty() && (pos = (Position) stack.peek()) != null) {
            try {
                stack.pop();
            } catch (IsEmptyException e) {
                e.printStackTrace();
            }
            if (currentMove < numberOfMoves) {
                fillStacks(chessTable.horseMove(pos), currentMove + 1, currentPos + pos.toString() + "-- ");
            } else {
                System.out.println(currentPos + pos.toString());
            }
        }
    }
}
