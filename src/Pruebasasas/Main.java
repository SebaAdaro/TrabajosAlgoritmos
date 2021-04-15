package Pruebasasas;

import PilasYColas.IsEmptyException;

public class Main {
    public static void main(String[] args) throws IsEmptyException {
        DinamicStack pila = new DinamicStack();
        Perro perro = new Perro("higuain", 2);
        Perro perro2 = new Perro("hola", 2);
        pila.stack(perro);
        pila.stack(perro2);
        Perro perro3 = (Perro) pila.peek();
        pila.pop();
        Perro perro4 = (Perro) pila.peek();

        System.out.println(perro3.getNombre());
        System.out.println(perro4.getNombre());
    }
}
