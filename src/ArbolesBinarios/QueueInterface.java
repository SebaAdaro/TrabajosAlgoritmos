package ArbolesBinarios;

import NuevoMovimientoDeCaballo.IsEmptyException;

public interface QueueInterface<T> {

    void enqueue(T element);

    T dequeue() throws IsEmptyException, ArbolesBinarios.IsEmptyException;

    boolean isEmpty();

    int size();

}
