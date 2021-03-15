package ComparacionDeAlgoritmo.Ej2;

public class InsertionSort {

    public static void insercion(int a[]){
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            int aux = a[i];
            while((pos > 0) && (a[pos-1] > aux)){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos] = aux;
        }
    }

    public static void insercionCadena(String a[]){
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            String aux = a[i];
            while((pos > 0) && (a[pos-1].compareTo(aux) > 0)){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos] = aux;
        }
    }
}



/*public class InsertionSort<T extends Comparable<? super T>> {

    void insertionSort(T[] array)
    {
        // start at the first index and iterate through to the end
        for (int i = 1; i < array.length; i++)
        {
            int currentIndex = i;
            /*
             * Check:
             *      1. that currentIndex is at least 1
             *      2. that the item directly before the currentIndex is greater than the item at currentIndex
             *
             * If both conditions are met, swap the indexes

            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
            {
                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
    }
}

*/

