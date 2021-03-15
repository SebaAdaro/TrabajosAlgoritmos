package ComparacionDeAlgoritmo.Ej2;

public class SelectionSort<T extends Comparable<? super T>> {

    void selectionSort(T[] array) {
        // step 1: loop from the beginning of the array to the second to last item
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            // step 2: save a copy of the currentIndex
            int minIndex = currentIndex;
            // step 3: loop through all indexes that proceed the currentIndex
            for (int i = currentIndex + 1; i < array.length; i++) {
                // step 4:  if the value of the index of the current loop is less
                //          than the value of the item at minIndex, update minIndex
                //          with the new lowest value index */
                if (array[i].compareTo(array[minIndex]) < 0) {
                    // update minIndex with the new lowest value index
                    minIndex = i;
                }
            }
            // step 5: if minIndex has been updated, swap the values at minIndex and currentIndex
            if (minIndex != currentIndex) {
                T temp = array[currentIndex];
                array[currentIndex] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
