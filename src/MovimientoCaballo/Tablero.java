package MovimientoCaballo;

import PilasYColas.DinamicStack;
import Util.Scanner;

public class Tablero {
    DinamicStack stack;
    Object tablero[][] = new Object[8][8];

    public void pila(){

    }
//    public static void chooseNextStep() {todo comento porque no implementamos un metodo y que no tire error
//        System.out.println("El caballo se encuentra en la posicion" + "A1" + "que desea hacer?");
//        int selection = Scanner.getInt("El caballo se puede mover a las posiciones" + Tablero.getOptions());
//        switch (selection) {
//            case 1:
//                Caballo.move();
//                break;
//            case 2:
//
//                break;
//        }
//    }

    public String getOptions() {
//        if (Caballo.getLocation == tablero[1][1]) {todo comento porque no implementamos un metodo y que no tire error
//            System.out.println("Tus opciones son moverse a B3 o C2");
//        }
        return "";
    }
    public void crearTablero() {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                tablero[i][j] = i + "" + j;
            }
        }
    }

    public void primerMovimiento() {

    }


}
