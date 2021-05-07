package Random;

public class Randomclass {

    public Randomclass(){}

    public int[] randomGenerate(){
        int a = (int) (5 + (Math.random() * 25));
        int b = (int) (5 + (Math.random() * 25));
        int c = (int) (5 + (Math.random() * 25));
        int d = (int) (5 + (Math.random() * 25));
        int e = (int) (5 + (Math.random() * 25));
        int[] hola = {a,b,c,d,e};
        return hola;
    }
}
