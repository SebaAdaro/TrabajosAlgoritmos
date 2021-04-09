package MovimientoCaballo;
import Util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Se encuentra en la posicion A1");
            System.out.println("1. Realizar el siguiente salto\n2.  Mostrar el contenido de las pilas.\n 3. Salir");
            int selection = Scanner.getInt("Ingrese la operacion que desea hacer: ");
            switch (selection) {
                case 1:
                    Tablero.chooseNextStep();
                    break;
                case 2:

                    break;
                case 3:

                    System.exit(0);
                default:
                    System.out.println("El numero ingresado no corresponde a una funcion, porfavor ingrese nuevamente un numero");
            }
        }
    }
}
