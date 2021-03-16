package ComparacionDeAlgoritmo.Ej2;

import java.util.Arrays;
import java.util.List;

public class SelectionSort<T extends Comparable<? super T>> {

    public void sort(T[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].compareTo(myArray[minIndex]) < 0) {
                    minIndex = i;
                }
                T temp = myArray[i];
                myArray[i] = myArray[minIndex];
                myArray[minIndex] = temp;
            }
        }

      /*  public static void main (String[]args){
            List<Integer> list = Arrays.asList(3, 2, 7, 1, 2, 2, 3, 0, -1, 6, 8);
            System.out.println("Old");
            list.forEach(System.out::println);
            //SelectionSort.sort(list);
            System.out.println("New");
            list.forEach(System.out::println);
        }*/

    }
}