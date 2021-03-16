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

    public void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;

        int[] arr3 = new int[n1 + n2];

        MergeAlgorithm mergeAlgorithm = new MergeAlgorithm();
        mergeAlgorithm.mergeArrays(arr1, arr2, n1, n2, arr3);

        System.out.println("Array after merging");
        for (int i = 0; i < n1 + n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
