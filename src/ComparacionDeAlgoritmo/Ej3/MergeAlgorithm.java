//Beltran Bulbarella, Sebastian Adaro, Josue Riera

package ComparacionDeAlgoritmo.Ej3;

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
