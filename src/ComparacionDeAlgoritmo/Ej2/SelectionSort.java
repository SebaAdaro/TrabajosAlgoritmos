//Beltran Bulbarella, Sebastian Adaro, Josue Riera

package ComparacionDeAlgoritmo.Ej2;

public class SelectionSort<T extends Comparable<? super T>> {

    public static int[] selectionSortInt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int minIndex = i;
                if (a[j] < (a[minIndex])) {
                    minIndex = j;
                }
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        return a;
    }

    public static String[] selectionsortStrings(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            if (a[i + 1].compareTo(a[minIndex]) < 0) {
                minIndex = i + 1;
            }
            String temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        return a;
    }

    public void selectionSortGeneric(T[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int minIndex = i;
            if (myArray[i + 1].compareTo(myArray[minIndex]) < 0) {
                minIndex = i + 1;
            }
            T temp = myArray[i];
            myArray[i] = myArray[minIndex];
            myArray[minIndex] = temp;
        }
    }

    public static int[] selectionRecursive(int[] myArray) {
        return selectionRecursive(myArray, 0, myArray.length - 1);
    }

    public static int[] selectionRecursive(int[] myArray, int lower, int higher) {
        if (lower < higher) {
            int indexOfMin = lower;
            int min = myArray[lower];
            for (int i = lower + 1; i <= higher; i++) {
                if (myArray[i] < min) {
                    min = myArray[i];
                    indexOfMin = i;
                }
            }
            myArray[indexOfMin] = myArray[lower];
            myArray[lower] = min;
            selectionRecursive(myArray, lower + 1, higher);
        }
        return myArray;
    }

    //main de testeo
    public static void main(String[] args) {
        int[] array = {10, -20, 122, 10000, 767, -1, 0, 9, 11};
        SelectionSort.selectionSortInt(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}