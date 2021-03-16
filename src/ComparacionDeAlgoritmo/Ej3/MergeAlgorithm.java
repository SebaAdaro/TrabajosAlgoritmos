package ComparacionDeAlgoritmo.Ej3;


/*
Dados dos arreglos ordenados, a y b, construir un tercer arreglo de salida c que contenga a
los elementos de ambos arreglos de entrada, y esté ordenado.
Algoritmo de merge
• Mantener un índice para recorrer el arreglo a otro para b y otro para c.
• Recorrer linealmente los arreglos a y b, asignando de a un elemento por vez en el
arreglo de salida c. El elemento a asignar en c es el menor entre el elemento actual de
a y el actual de b.
• Incrementar en 1 el índice del arreglo del que provino el elemento y también
incrementar en 1 el índice de c. • Repetir hasta que uno de los dos arreglos de entrada haya sido pasado totalmente a c.
• Pasar el resto del otro arreglo a c.
Se pide codificar el algoritmo merge para cualquier tipo de objetos comparables.
 */
    public class MergeAlgorithm<T extends Comparable<? super T>> {

        public static int[] merge1(int[] a, int[] b) {
        int cLength = a.length + b.length;
        int[] c = new int[cLength];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length+1] = b[j];
        }
        bubbleSort(c);
        return c;
    }

    public static int[] bubbleSort(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    //El carácter a viene antes que b alfabéticamente. Por lo tanto, el resultado es -1
                    //El carácter b viene antes que alfabéticamente. Por lo tanto, la salida es 1
                    //El carácter b es equivalente, por lo tanto, la salida es 0.
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] a = {1,10,100};
        int[] b = {2,9,99};
        merge1(a,b);
        System.out.println(merge1(a,b));
    }
}


