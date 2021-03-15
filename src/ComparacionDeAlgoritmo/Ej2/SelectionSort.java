package ComparacionDeAlgoritmo.Ej2;

import java.util.ArrayList;

public class SelectionSort{

    ArrayList<Integer> arrayList = new ArrayList();

    public int SeqSearch(ArrayList arrayList, int k) {
        for (int i = 0; i < arrayList.size(); i++)
            if (arrayList.get(i).equals(k))
                return i;
        return -1;
    }

    public void sort(ArrayList arrayList1){
        for (int i = 0; i < arrayList1.size(); i++) {
            arrayList1.get(i);
        }

    }
}
