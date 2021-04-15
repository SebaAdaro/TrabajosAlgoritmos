package NuevoMovimientoDeCaballo;

import PilasYColas.IsEmptyException;
import PilasYColas.Node;
import PilasYColas.StackInterface;

public class DynamicStack<T> implements StackInterface<T> {
    private int size;
    private Node tope;

    @Override
    public boolean isEmpty() {
        return tope == null;
    }

    @Override
    public T peek() {
        return (T) tope.getDato();
    }

    @Override
    public void pop() throws IsEmptyException {
        if (tope != null) {
            tope = tope.getPuntero();
            size--;
        } else {
            throw new IsEmptyException();
        }
    }

    @Override
    public void stack(T element) {
        Node aux = new Node();
        aux.setDato(element);

        if (tope != null) {
            aux.setPuntero(tope);
        }
        tope = aux;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void empty() {
        tope = null;
        size = 0;
    }
}
