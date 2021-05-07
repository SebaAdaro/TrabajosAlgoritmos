package NuevoMovimientoDeCaballo;

import Util.Scanner;

public class Main {
    public static void main(String[] args) throws IsEmptyException {
        Object position = new Position("A", 1);
        int cant = 3;
        while (true) {
            System.out.println("You are in this position: " + position);
            System.out.println("1. Make the next jump\n2. Show the Stacks contents\n3. Leave\n");
            int selection = Scanner.getInt("Choose the option you want: ");

            System.out.println();

            MoveHorse moveHorse = new MoveHorse(cant, (Position) position);
            Board board = new Board();
            switch (selection) {
                case 1:
                    position = board.makeNextMove((Position) position);
                    moveHorse.fillStacks(board.horseMove((Position) position), cant, ((Position) position).getLetter() + ((Position) position).getNumber());
                    break;
                case 2:
                    moveHorse.play();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("The number entered does not correspond to a function, please enter a number again");
            }
        }
    }
}
