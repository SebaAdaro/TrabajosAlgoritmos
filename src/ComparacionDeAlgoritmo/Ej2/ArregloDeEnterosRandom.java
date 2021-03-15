package ComparacionDeAlgoritmo.Ej2;

import Util.Scanner;

//Generar en forma random un arreglo de números enteros para distintos valores de N
//(siendo N el tamaño del arreglo) y comparar los tiempos para distintos valores de N.
public class ArregloDeEnterosRandom {
    int n;
    static int[] myArray;
    public static void randomArray(int n){
        for (int i = 0; i < n; i++) {
            myArray[i] = ((int)Math.random()*100);
        }
    }

    public static void main(String[] args) {
        int n = Scanner.getInt("Ingrese su tamano");

    }
}
