package NuevoMovimientoDeCaballo;

import PilasYColas.DinamicStack;

public class Board {
    private Position[][] positions = new Position[8][8];
    public String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public Board() {
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions[i].length; j++) {
                positions[i][j] = new Position(letters[i], j);
            }
        }
    }

    public DinamicStack horseMove(Position position) {
        DinamicStack posibleMoves = new DinamicStack();

        int[] x = {1, -1, 2, 2, 1, -1, -2, -2};
        int[] y = {2, 2, 1, -1, -2, -2, -1, 1};

        for (int i = 0; i < 8; i++) {
            int X = getLetterIndex(position.getLetter()) + x[i];
            int Y = position.getNumber() + y[i];
            if(X >= 0 && X <= 7 && Y>= 0 && Y <= 7){
                posibleMoves.stack(positions[X][Y]);
            }
        }
        return posibleMoves;
    }

    private int getLetterIndex(String letter) {
        int index = 0;
        for (int i = 0; i < letters.length; i++) {
            if(letter.equals(letters[i])){
                index = i;
            }
        }
        return index;
    }
}

