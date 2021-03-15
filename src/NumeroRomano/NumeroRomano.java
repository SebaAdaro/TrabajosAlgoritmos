package NumeroRomano;

import java.util.ArrayList;

public class NumeroRomano {
    public static void main(String[] args) {
        NumeroRomano numero = new NumeroRomano();
        String a = "cxix";
        System.out.println(numero.pasarArray(a));
    }
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Character> letter = new ArrayList<>();

    public int pasarArray(String romanos) {

        romanos = romanos.toLowerCase();
        for (int i = 0; i < romanos.length(); i++) {
            letter.add(romanos.charAt(i));
        }
        if (search(letter, 'i') > 3) {
            throw new RuntimeException("No existe un numero romano con mas de 3 'I'");
        }
        if (search(letter, 'x') > 3) {
            throw new RuntimeException("No existe un numero romano con mas de 3 'X'");
        }
        if (search(letter, 'c') > 4 ) {
            throw new RuntimeException("No existe un numero romano con mas de 3 'C'");
        }
        if (search(letter, 'v') > 1) {
            throw new RuntimeException("No existe un numero romano con mas de 1 'V'");
        }
        if (search(letter, 'l') > 1) {
            throw new RuntimeException("No existe un numero romano con mas de 1 'L'");
        }
        if (search(letter, 'd') > 1) {
            throw new RuntimeException("No existe un numero romano con mas de 1 'D'");
        }
        if (search(letter, 'm') > 1) {
            throw new RuntimeException("El maximo de numeros al que llegamos es a.txt 999");
        }

        for (int i = 0; i < letter.size(); i++) {
            if (letter.get(i).equals('i')) {
                numbers.add(1);
            }
            if (letter.get(i).equals('v')) {
                numbers.add(5);
            }
            if (letter.get(i).equals('x')) {
                numbers.add(10);
            }
            if (letter.get(i).equals('l')) {
                numbers.add(50);
            }
            if (letter.get(i).equals('c')) {
                numbers.add(100);
            }
            if (letter.get(i).equals('d')) {
                numbers.add(500);
            }
            if (letter.get(i).equals('m')) {
                numbers.add(1000);
            }
        }

        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if (numbers.get(j) > numbers.get(i)){
                    sum1 = (-numbers.get(i));
                }
            }
        }
        return sum + 2*sum1 ;
    }

    public int search(ArrayList<Character> a, Character k) {
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(k)) {
                j++;
            }
        }
        return j;
    }
}
