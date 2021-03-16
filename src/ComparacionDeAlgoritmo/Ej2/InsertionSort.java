package ComparacionDeAlgoritmo.Ej2;

public class InsertionSort<T extends Comparable < ? super T>> {

    public static void insertion(int [] a){
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

    public static void insertionCadena(String[] a){
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            String aux = a[i];
            while((pos > 0) && (a[pos-1].compareTo(aux) < 0)){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos] = aux;
        }
    }

    public void insertionObjetoT(T[] a){
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            T aux = a[i];
            while((pos > 0) && ((a[pos-1]).compareTo(aux) < 0)){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos] = aux;
        }
    }

}

