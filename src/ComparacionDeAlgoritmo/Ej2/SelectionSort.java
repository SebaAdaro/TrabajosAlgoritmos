package ComparacionDeAlgoritmo.Ej2;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public void sort(List<Integer> arrayList) {
        int min;
        int place;
        for (int i = 0; i < arrayList.size(); i++) {
            min = arrayList.get(i);
            place = i;
            for (int j = i + 1; j < arrayList.size(); j++) {
                Integer tempValue = arrayList.get(j);
                if (min > tempValue) {
                    min = tempValue;
                    place = j;
                }
            }
            arrayList.set(place, arrayList.get(i));
            arrayList.set(i, min);
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> list = Arrays.asList(3, 2, 7, 1, 2, 2, 3, 0, -1, 6, 8, 98, 95, -3, -6,
                -96, 1, 17, 52, 36, 8, 62, 25, 225, 5505, 5, 56, 2);
        System.out.println("Old");
        list.forEach(System.out::println);
        selectionSort.sort(list);
        System.out.println("New");
        list.forEach(System.out::println);
    }

}
