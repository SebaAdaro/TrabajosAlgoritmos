package MiniBlast;

import java.util.ArrayList;
import java.util.List;

public class Blast {

    List<Character> gen1;
    List<Character> gen2;

    public Blast(List<Character> gen1, List<Character> gen2) {
        this.gen1 = gen1;
        this.gen2 = gen2;
    }

    public double toCheck() {
        int counter = 0;
        double maxCountNumber;

        for (int k = 0; k < gen1.size(); k++) {

            if ((gen1.get(k).equals(gen2.get(k)) && gen1.get(k + 1).equals(gen2.get(k + 1))) || (gen1.get(k + 1).equals(gen2.get(k + 1)) && !gen1.get(k + 2).equals(gen2.get(k + 2)))) {
                counter++;

                if (!gen1.get(k + 2).equals(gen2.get(k + 2))) {
                    counter++;
                }
            }
        }

        return counter / gen1.size();
    }

    public void check() {
        int counter = 0;

        List<Character> theEquals = new ArrayList<>();

        for (int i = 0; i < gen1.size(); i++) {
            for (int j = 0; j < gen2.size(); j++) {
                if (gen1.get(i).equals(gen2.get(j))) {
                    counter++;
                    i++;
                }
                if (gen1.get(i).equals(gen2.get(j))) {
                    counter++;
                }
            }
        }
    }
}
