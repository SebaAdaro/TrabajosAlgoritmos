package PilasYColas;


public class StaticQueue<T> implements QueueInterface<T> {
    private T[] array;
    private int front, size, back;


    public StaticQueue() {
        array = (T[]) new Object[10];
        front = 0;
        back = 0;
        size = 0;  //todo change amount for size
    }

    @Override
    public void enqueue(T element) {
        if (!isFull()) {
            size++;
            array[back - 1] = element;
        } else {
            grow();
            enqueue(element);
        }
    }

    private boolean isFull() {
        return array.length == size;
    }

    private void increment() {
        if (back != array.length) {
            back++;
        } else if (size < array.length) {
            back = 1;
        }
    }

    @Override
    public T dequeue() throws IsEmptyException {
        if (!isEmpty()) {
            T temp = array[front];
            front++;
            size++;
            return temp;
        } else {
            throw new IsEmptyException();
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void grow() { //cambiar para que lo copie en orden
        T[] newArray = (T[]) new Object[array.length * 2];
        int index = 0;
        for (int i = front; i < array.length; i++) {
            newArray[index++] = array[i];
        }
        for (int i = back - 1; i < front; i++) {
            newArray[index++] = array[i];
        }
        front = 0;
        back = array.length;
        array = newArray;
    }
}

