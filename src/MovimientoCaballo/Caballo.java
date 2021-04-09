package MovimientoCaballo;

import PilasYColas.DinamicStack;

public class Caballo {
    private int position[][];
    private int posiblePosition[][];

    public Caballo(int a, int b) {
        this.position = position;
    }


    public int[][] getPosition() {
        return position;
    }

    public DinamicStack possibleMoves() {
        DinamicStack stack = new DinamicStack();

//        for (int i = 0; i < posiblePosition().length; i++) { todo comento porque no implementamos un metodo y que no tire error
//            stack.stack(posiblePosition());
//        }
        return stack;
    }

    public DinamicStack possibleMovesParaCapos() {
        DinamicStack stack = new DinamicStack();
        int n = 0;
        int k = 0;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
//                if (Caballo.getPosition() == Caballo[i][j]) {todo comento porque no implementamos un metodo y que no tire error
//                    n = i;
//                    k = j;
//                }
            }
        }
        if (n < 2 && k > 1 || k < 6) { //first
            stack.stack(new Caballo(n + 1, k + 2));
            stack.stack(new Caballo(n + 2, k + 1));
        }

        if (n < 8 && k > 2) { //fourth
            stack.stack(new Caballo(n + 2, k - 1));
            stack.stack(new Caballo(n + 1, k - 2));
        }

//        if (n && k ) { // second   todo comento porque no implementamos un metodo y que no tire error
//            stack.stack(new Caballo(n , k));
//            stack.stack(new Caballo(n , k));
//
//        }
//
//        if (n && k) { //third   todo comento porque no implementamos un metodo y que no tire error
//            stack.stack(new Caballo(n, k));
//            stack.stack(new Caballo(n, k));
//
//        }

        return stack;
    }

}
