package MiniBlast;

import java.util.ArrayList;
import java.util.List;

public class Blast {

    public static double toCheck(List<Character> gen1, List<Character> gen2) {
        double counter = 0;
        for (int k = 0; k < gen1.size()-1; k++) {
            if ((gen1.get(k).equals(gen2.get(k)) && gen1.get(k + 1).equals(gen2.get(k + 1))) || (gen1.get(k + 1).equals(gen2.get(k + 1)) && !gen1.get(k + 2).equals(gen2.get(k + 2)))) {
                counter++;

                if (!gen1.get(k + 2).equals(gen2.get(k + 2))) {
                    counter++;
                }
            }
        }
        return (counter / gen1.size()) * 100;
    }

    public static double check(List<Character> gen1, List<Character> gen2) {
        double counter = 0;
        if (gen1.size() == gen2.size()) {
            for (int i = 0; i < gen1.size(); i++) {
                if (gen1.get(i).equals(gen2.get(i))) {
                    counter++;
                }
            }
        }
        return (counter / gen1.size()) * 100;
    }

    public static void main(String[] args) {
        List<Character> a = new ArrayList<>();
        a.add('A');
        a.add('A');
        a.add('A');
        a.add('A');

        List<Character> b = new ArrayList<>();
        a.add('A');
        a.add('A');
        a.add('A');
        a.add('A');

        System.out.println(Blast.toCheck(a,b));

    }
}
