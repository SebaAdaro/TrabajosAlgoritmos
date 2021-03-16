package ComparacionDeAlgoritmo.Ej2;

import Util.Scanner;

public class ArregloDeEnterosRandom {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        int n = Scanner.getInt("Escribi el largo del array: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)Math.random() * 100;
        }
        System.out.println("inicio Selection sort: ");
        long start1 = System.currentTimeMillis();
        selectionSort.sortInt(array);
        long end1 = System.currentTimeMillis();
        System.out.println("Fin selection sort. Tardo: " + (end1 - start1));


        System.out.println("inicio Bubblesort: ");
        long start2 = System.currentTimeMillis();
        bubbleSort.bubbleSort(array);
        long end2 = System.currentTimeMillis();
        System.out.println("Fin BuubleSort. Tardo: " + (end2 - start2));


        System.out.println("inicio InsertionSort: ");
        long start3 = System.currentTimeMillis();
        insertionSort.insertion(array);
        long end3 = System.currentTimeMillis();
        System.out.println("Fin InsertionSort. Tardo: " + (end2 - start2));
    }
}
//Testeando varias veces con distintos valores de n, nos dimos cuenta que el metodo de sort mas lento es el selection,
// y incersion y burbuja, tienen tiempo de compilacion muy parecidos, aunque el metodo de incersion es el mas rapido.
