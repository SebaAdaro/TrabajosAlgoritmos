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

    public void merge(int[] a, int[] b) {
        int cLength = a.length + b.length;
        int[] c = new int[cLength];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] > b[j]) {
                    c[i] = a[i];
                }
                if (a[i] <= b[j]) {
                    c[i] = b[j];
                }
            }
        }
    }

    public void merge(int[] a, int[] b) {
        int cLength = a.length + b.length;
        int[] c = new int[cLength];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] > b[j]) {
                    c[i] = a[i];
                }
                if (a[i] <= b[j]) {
                    c[i] = b[j];
                }
            }
        }
    }
}


