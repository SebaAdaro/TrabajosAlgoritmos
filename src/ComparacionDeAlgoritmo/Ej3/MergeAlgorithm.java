package ComparacionDeAlgoritmo.Ej3;



/*
Otro problema frecuente es intercalar dos secuencias ordenadas. Este problema se conoce en
inglés como merge. El enunciado es:
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
public class MergeAlgorithm{

    public void mergeArrays(int[] a, int[] b, int var1, int var2, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < var1 && j < var2) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (i < var1)
            c[k++] = a[i++];
        while (j < var2)
            c[k++] = b[j++];
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int var1 = a.length;

        int[] b = {5,15,25,35};
        int var2 = b.length;

        int[] c = new int[var1 + var2];

        MergeAlgorithm mergeAlgorithm = new MergeAlgorithm();
        mergeAlgorithm.mergeArrays(a, b, var1, var2, c);

        printArray(c);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
