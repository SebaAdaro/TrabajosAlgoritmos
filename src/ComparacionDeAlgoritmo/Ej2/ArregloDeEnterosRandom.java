package ComparacionDeAlgoritmo.Ej2;

import java.util.Arrays;
import java.util.List;

public class ArregloDeEnterosRandom {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        List<Integer> list = Arrays.asList(3, 2, 7, 1, 2, 2, 3, 0, -1, 6, 8, 98, 95, -3, -6, -96, 1, 17, 52, 36, 8, 62, 25, 225, 5505, 5, 56, 2);

        System.out.println("inicio Selection sort: ");
        double start1 = System.currentTimeMillis();
        selectionSort.sort(list);
        double end1 = System.currentTimeMillis();
        System.out.println("Fin selection sort. Tardo: " + (end1 - start1));

        System.out.println("inicio Bubblesort: ");
        double start2 = System.currentTimeMillis();
        bubbleSort.bubbleSort(list);
        double end2 = System.currentTimeMillis();
        System.out.println("Fin BuubleSort. Tardo: " + (end2 - start2));

        System.out.println("inicio InsertionSort: ");
        double start3 = System.currentTimeMillis();
        insertionSort.insertion(list);
        double end3 = System.currentTimeMillis();
        System.out.println("Fin InsertionSort. Tardo: " + (end2 - start2));
    }
}
