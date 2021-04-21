package ArbolesBinarios;

import PilasYColas.IsEmptyException;

public interface QueueInterface<T> {

    void enqueue(T element);

    T dequeue() throws IsEmptyException, ArbolesBinarios.IsEmptyException;

    boolean isEmpty();

    int size();

}
