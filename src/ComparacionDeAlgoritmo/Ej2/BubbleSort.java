package ComparacionDeAlgoritmo.Ej2;

public class BubbleSort<T extends Comparable<? super T>> {

    public T[] bubbleSort(T[] myArray) {
        int var1;
        int var2;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].compareTo(myArray[j]) > 0) {
                    //El carácter a viene antes que b alfabéticamente. Por lo tanto, el resultado es -1
                    //El carácter b viene antes que alfabéticamente. Por lo tanto, la salida es 1
                    //El carácter b es equivalente, por lo tanto, la salida es 0.
                    T temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                    var1 = i;
                }
            }
        }
        return myArray;
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int array[] = {64, 34, 25, 12, 22, 90, 11, 11, 12, 34};
        //array = ob.bubbleSort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }
}
