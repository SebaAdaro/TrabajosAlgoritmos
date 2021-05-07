package Random;

public class Main {
    public static void main(String[] args) {
        int[] randomclass;
        int[] randomclass2;
        int[] randomclass3;
        int[] randomclass4;
        Randomclass randomclass1 = new Randomclass();
        randomclass = randomclass1.randomGenerate();
        randomclass2 = randomclass1.randomGenerate();
        randomclass3 = randomclass1.randomGenerate();
        randomclass4 = randomclass1.randomGenerate();


        for (int i = 0; i < randomclass.length; i++) {
            System.out.print(randomclass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < randomclass2.length; i++) {
            System.out.print(randomclass2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < randomclass3.length; i++) {
            System.out.print(randomclass3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < randomclass4.length; i++) {
            System.out.print(randomclass4[i] + " ");
        }

    }
}
