package ComparacionDeAlgoritmo.Ej2;

public class BubbleSort {

    public void sort(int[] myArray){
        int var1 = 0;
        int var2 = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length-1; j++) {
                if (myArray[j] < myArray[i]){
                    myArray[j] = var1;
                    myArray[i] = var2;
                    myArray[j] = var2;
                    myArray[i] = var1;
                }
            }
        }
    }
}

