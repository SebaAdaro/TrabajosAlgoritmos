//Beltran Bulbarella, Sebastian Adaro, Josue Riera

package ComparacionDeAlgoritmo.Ej3;

public class MergeAlgorithm<T extends Comparable<? super T>> {

    public void mergeArraysGeneric(T[] a, T[] b, int var1, int var2, T[] c) {
        int i = 0, j = 0, k = 0;
        while (i < var1 && j < var2) {
            if (a[i].compareTo(b[j]) < 0)
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (i < var1)
            c[k++] = a[i++];
        while (j < var2)
            c[k++] = b[j++];
    }
}
