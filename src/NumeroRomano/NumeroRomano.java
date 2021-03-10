package NumeroRomano;

import java.util.ArrayList;

public class NumeroRomano {
    public static void main(String[] args) {
        NumeroRomano numero = new NumeroRomano();
        String a = "";
        System.out.println(numero.pasarArray(a));
    }

    public int pasarArray(String romanos) {
        ArrayList<Character> letras = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        romanos.toLowerCase();
        for (int i = 0; i < romanos.length(); i++) {
            letras.add(romanos.charAt(i));
        }
        if (search(letras, 'i') > 3) {
            throw new RuntimeException("No existe un numero romano con mas de 3 'I'");
        }
        if (search(letras, 'x') > 3) {
            throw new RuntimeException("No existe un numero romano con mas de 3 'X'");
        }
        if (search(letras, 'c') > 3) {
            throw new RuntimeException("No existe un numero romano con mas de 3 'C'");
        }
        if (search(letras, 'v') > 1) {
            throw new RuntimeException("No existe un numero romano con mas de 1 'V'");
        }
        if (search(letras, 'l') > 1) {
            throw new RuntimeException("No existe un numero romano con mas de 1 'L'");
        }
        if (search(letras, 'd') > 1) {
            throw new RuntimeException("No existe un numero romano con mas de 1 'D'");
        }
        if (search(letras, 'm') > 1) {
            throw new RuntimeException("el maximo de numeros al que llegamos es a 999");
        }

        for (int i = 0; i < letras.size(); i++) {
            if (letras.get(i).equals('i')) {
                numeros.add(1);
            }
            if (letras.get(i).equals('v')) {
                numeros.add(5);
            }
            if (letras.get(i).equals('x')) {
                numeros.add(10);
            }
            if (letras.get(i).equals('l')) {
                numeros.add(50);
            }
            if (letras.get(i).equals('c')) {
                numeros.add(100);
            }
            if (letras.get(i).equals('d')) {
                numeros.add(500);
            }
            if (letras.get(i).equals('m')) {
                numeros.add(1000);
            }
        }
        int b = 0;
        for (int i = 0; i < numeros.size(); i++) {
            b += numeros.get(i);
        }
        return b;
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
