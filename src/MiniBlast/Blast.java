package MiniBlast;

public class Blast {

    public static double check(Character[] gen1, Character[] gen2) {
        double counter = 0;
        double n = gen1.length;

        for (int i = 0; i < gen1.length; i++) {
            if (gen1[i].equals((gen2[i]))) {
                counter++;
            }
        }
        return ((counter / n) * 100);
    }

    public static double checkString(String gen1, String gen2) {
        double counter = 0;
        int n1 = gen1.length();
        int n2 = gen2.length();

        char[] gen11 = new char[n1];
        char[] gen21 = new char[n2];

        for (int i = 0; i < gen1.length(); i++) {//transforma el String en un array de char para compararlo
            gen11[i] = gen1.charAt(i);
        }

        for (int i = 0; i < gen2.length(); i++) {//transforma el String en un array de char para compararlo
            gen21[i] = gen2.charAt(i);
        }

        for (int i = 0; i < gen11.length; i++) { //realiza la comparacion
            if (gen11[i] == (gen21[i])) {
                counter++;
            }
        }
        return ((counter / n1) * 100);
    }

    public static void main(String[] args) {
        Character[] a = {'a', 'c', 'c', 'd'};
        Character[] b = {'a', 'b', 'c', 'd'};

        String gen1 = "cgtacctgatt";
        String gen2 = "cttacctgaaa";

        System.out.println("Strings");
        System.out.println(Blast.checkString(gen1, gen2) + "%");
        System.out.println("\nCharacter");
        System.out.println(Blast.check(a, b) + "%");

    }
}
