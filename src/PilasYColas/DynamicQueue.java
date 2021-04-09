package PilasYColas;

public class DynamicQueue<T> implements QueueInterface<T> {
    private Node back;
    private Node front;
    private int size = 0;

    @Override
    public void enqueue(T element) {
        if (isEmpty()) {
            back = new Node();
            back.setDato(element);
            front = back;

        } else {
            Node aux = new Node();
            aux.setDato(element);
            back.setPuntero(aux);
            back = aux;
        }
        size++;
    }

    @Override
    public T dequeue() throws IsEmptyException {
        if (isEmpty()) throw new IsEmptyException();

        front = front.getPuntero();
        size--;
        return (T) front.getDato();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }
}
