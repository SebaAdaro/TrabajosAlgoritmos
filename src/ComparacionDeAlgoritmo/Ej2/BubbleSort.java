package ComparacionDeAlgoritmo.Ej2;

public class BubbleSort {

    public int[] bubbleSort(int[] myArray) {
        int var1;
        int var2;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length - 1; j++) {
                if (myArray[j] < myArray[i]) {
                    var1 = myArray[i];
                    var2 = myArray[j];
                    myArray[i] = var2;
                    myArray[j] = var1;
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
        int array[] = {64, 34, 25, 12, 22, 11, 90};
        array = ob.bubbleSort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }
}
