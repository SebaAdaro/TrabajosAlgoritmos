package ComparacionDeAlgoritmo.Ej2;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public List<Integer> bubbleSort(List<Integer> myArray) {
        int var1;
        int var2;

        for (int i = 0; i < myArray.size(); i++) {
            for (int j = i + 1; j < myArray.size(); j++) {
                if (myArray.get(j) < myArray.get(i)) {
                    var1 = myArray.get(i);
                    var2 = myArray.get(j);
                    myArray.set(i,var2);
                    myArray.set(j,var1);
                }
            }
        }
        return myArray;
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        List<Integer> list = Arrays.asList(3, 2, 7, 1, 2, 2, 3, 0, -1, 6, 8);
        list = ob.bubbleSort(list);
        System.out.println("Sorted array");
        list.forEach(System.out::println);
    }
}
