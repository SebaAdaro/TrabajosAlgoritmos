//Beltran Bulbarella, Sebastian Adaro, Josue Riera

package ComparacionDeAlgoritmo.Ej2;

public class ComparacionDeTiempos {
    public static void main(String[] args) {

        int n=100000;
        int[]a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) Math.random();
        }

        long inicio = System.nanoTime();
        InsertionSort.insertionSortInt(a);
        long fin = System.nanoTime();

        long inicio2 = System.nanoTime();
        BubbleSort.bubbleSortInt(a);
        long fin2 = System.nanoTime();

        long inicio3 = System.nanoTime();
        SelectionSort.selectionSortInt(a);
        long fin3 = System.nanoTime();

        double dif  = (double)  (fin - inicio) *(0.000000001);
        double dif2 = (double) (fin2 - inicio2)*(0.000000001);
        double dif3 = (double) (fin3 - inicio3)*(0.000000001);

        System.out.println("Selection sort: \t");
        System.out.print("El tiempo de ejecucion es de " + dif + " Segundos.\n");
        System.out.println("Bubble sort: \t");
        System.out.print("El tiempo de ejecucion es de " + dif2 + " Segundos.\n");
        System.out.println("Insertion sort: \t");
        System.out.print("El tiempo de ejecucion es de " + dif3 + " Segundos.\n");

        //Testeando varias veces con altos y distintos valores de n, nos dimos cuenta que el metodo de sort mas rapido es el de selection,
        // mientras que incertion y bubble tienen tiempo de compilacion muy parecidos, aunque el metodo de incertion es ligeramente mas rapido.

    }
}