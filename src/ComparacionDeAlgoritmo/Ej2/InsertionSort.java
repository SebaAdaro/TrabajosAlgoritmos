package ComparacionDeAlgoritmo.Ej2;


import java.util.List;

public class InsertionSort<T extends Comparable < ? super T>> {

    public void insertion(List<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            int pos = i;
            int aux = a.get(i);
            while ((pos > 0) && (a.get(pos - 1) > aux)) {
                int value = a.get(pos - 1);
                a.set(pos, value);
                pos--;
            }
            a.set(pos, aux);
        }
    }

    public static void insertionCadena(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            String aux = a[i];
            while ((pos > 0) && (a[pos - 1].compareTo(aux) < 0)) {
                a[pos] = a[pos - 1];
                pos--;
            }
            a[pos] = aux;
        }
    }

    public void insertionObjetoT(T[] a, Comparable<T> k) {
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            T aux = a[i];
            while ((pos > 0) && (k.compareTo(a[pos - 1]) < 0)) {
                a[pos] = a[pos - 1];
                pos--;
            }
            a[pos] = aux;
        }
    }
}