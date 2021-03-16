package ComparacionDeAlgoritmo.Ej2;

public class SelectionSort<T extends Comparable<? super T>> {

    public static int[] sortInt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            if (a[i + 1] < (a[minIndex])) {
                minIndex = i + 1;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        return a;
    }

    public static String[] sortIntCadena(String[] a) {
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

    public void sort(T[] myArray) {
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
}

     /* public static void main(String[] args) {
        int[] a = {12,4432,5,2,1,4,6};
        for (int i = 0; i < a.length; i++) {
            System.out.println(selectionRecursive(a)[i]);
        }
    }
}
*/

      /*  public static void main (String[]args){
            List<Integer> list = Arrays.asList(3, 2, 7, 1, 2, 2, 3, 0, -1, 6, 8);
            System.out.println("Old");
            list.forEach(System.out::println);
            //SelectionSort.sort(list);
            System.out.println("New");
            list.forEach(System.out::println);
        }*/