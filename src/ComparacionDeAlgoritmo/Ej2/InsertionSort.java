//Beltran Bulbarella, Sebastian Adaro, Josue Riera

package ComparacionDeAlgoritmo.Ej2;

public class InsertionSort<T extends Comparable < ? super T>> {

    public static void insertionSortInt(int [] a){
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

    public static void insertionString(String[] a){
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

    public void insertionGeneric(T[] a){
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

    //main de testeo
    public static void main(String[] args) {
        int[] array = {10, -20, 122, 10000, 767, -1, 0, 9, 11};
        InsertionSort.insertionSortInt(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

