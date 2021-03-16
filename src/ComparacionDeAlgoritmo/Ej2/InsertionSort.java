package ComparacionDeAlgoritmo.Ej2;

public class InsertionSort<T extends Comparable < ? super T>> {

    public void insertion(int [] a){
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

    //main de testeo
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {5,1,6,3,9,6,5};
        insertionSort.insertion(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //insertion de Strings
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

    //insertion generico
    public void insertionObjetoT(T[] a, Comparable<T> k){
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            T aux = a[i];
            while((pos > 0) && (k.compareTo( a[pos-1]) < 0)){
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
            while((pos > 0) && (a[pos-1].compareTo(aux) < 0)){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos] = aux;
        }
    }

}

