package ComparacionDeAlgoritmo.Ej1;
//Beltran Bulbarella, Sebastian Adaro, Josue Riera
public class AlgoritmoBusquedaSecuencial {

    public int SeqSearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++)
            if (k == a[i])
                return i;
        return -1;
    }

}
