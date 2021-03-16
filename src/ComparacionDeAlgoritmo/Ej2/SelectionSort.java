package ComparacionDeAlgoritmo.Ej2;

public class SelectionSort<T extends Comparable<? super T>> {

        public int[] sortInt(int[] a){
            for (int i = 0; i < a.length; i++) {
                int minIndex = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < (a[minIndex])) {
                        minIndex = j;
                    }
                    int temp = a[i];
                    a[i] = a[minIndex];
                    a[minIndex] = temp;
                }
            }
            return a;
        }

    public static String[] sortIntCadena(String [] a){
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minIndex]) < 0) {
                    minIndex = j;
                }
                String temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        return a;
    }

    public void sort(T[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j].compareTo(myArray[minIndex]) < 0) {
                    minIndex = j;
                }
                T temp = myArray[i];
                myArray[i] = myArray[minIndex];
                myArray[minIndex] = temp;
            }
        }
    }






      /*  public static void main (String[]args){
            List<Integer> list = Arrays.asList(3, 2, 7, 1, 2, 2, 3, 0, -1, 6, 8);
            System.out.println("Old");
            list.forEach(System.out::println);
            //SelectionSort.sort(list);
            System.out.println("New");
            list.forEach(System.out::println);
        }*/

}