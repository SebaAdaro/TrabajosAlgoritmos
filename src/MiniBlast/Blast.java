package MiniBlast;

import java.util.List;

public class Blast {

    public double toCheck(List<Character> query, List<Character> comp1) {
        int counter = 0;
        double maxCountNumber;

        for (int k = 0; k < query.size(); k++) {

            if ((query.get(k).equals(comp1.get(k)) && query.get(k + 1).equals(comp1.get(k + 1))) || (query.get(k + 1).equals(comp1.get(k + 1)) && !query.get(k + 2).equals(comp1.get(k + 2)))) {
                counter++;

                if (!query.get(k + 2).equals(comp1.get(k + 2))) {
                    counter++;
                }
            }
        }

        maxCountNumber = counter;
        return maxCountNumber;
        //return (maxCountNumber / query.size()) * 100;
    }


//    public void check() {
//        int counter = 0;
//
//        List<Character> theEquals = new ArrayList<>();
//
//        for (int i = 0; i < gen1.size(); i++) {
//            for (int j = 0; j < gen2.size(); j++) {
//                if (gen1.get(i).equals(gen2.get(j))) {
//                    counter++;
//                    i++;
//                }
//                if (gen1.get(i).equals(gen2.get(j))) {
//                    counter++;
//                }
//            }
//        }
//    }
}
