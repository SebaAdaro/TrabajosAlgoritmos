package NuevoMovimientoDeCaballo;
import PilasYColas.IsEmptyException;
import Util.Scanner;

public class Main {
    public static void main(String[] args) throws IsEmptyException {
        Object position = new Position("A",1);

        while (true) {
            System.out.println("You are in this position: " + position);
            System.out.println("1. Make the next jump\n2. Show the Stacks contents\n 3. Leave");
            int selection = Scanner.getInt("Choose the option you want: ");
            Board board = new Board();
            switch (selection) {
                case 1:
                    board.makeNextMove(position);
                    break;
                case 2:
                    board.showStack();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("El numero ingresado no corresponde a una funcion, porfavor ingrese nuevamente un numero");
            }
        }
    }
}
