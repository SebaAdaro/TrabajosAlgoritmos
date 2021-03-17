//Beltran Bulbarella, Sebastian Adaro, Josue Riera

package ComparacionDeAlgoritmo.Ej2;

public class BubbleSort<T extends Comparable<? super T>> {

    public static int[] bubbleSortInt(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    public String[] bubbleSortString(String[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].compareTo(myArray[j]) > 0) {
                    String temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    public T[] bubbleGeneric(T[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].compareTo(myArray[j]) > 0) {
                    T temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    //main de testeo
    public static void main(String[] args) {
        int[] array = {10, -20, 122, 10000, 767, -1, 0, 9, 11};
        BubbleSort.bubbleSortInt(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
