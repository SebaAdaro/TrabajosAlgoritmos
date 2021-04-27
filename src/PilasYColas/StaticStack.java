package PilasYColas;

import NuevoMovimientoDeCaballo.IsEmptyException;
import NuevoMovimientoDeCaballo.StackInterface;

public class StaticStack<T> implements StackInterface<T> {
    private Object[] queue;
    private int top = -1;

    @Override
    public void stack(T element) {
        if(queue == null){
            queue = new Object[10];
            queue[0] = element;
            top = 0;
        }
        else push(element);
    }

    public void push(T object) {
        if (top + 1 == queue.length) {
            grow();
        }
        top++;
        queue[top] = object;
    }

    @Override
    public void pop() throws IsEmptyException {
        if(isEmpty()) {
            throw new IsEmptyException();
        }
        top--;
    }

    public T peek() {
        if (!isEmpty())
            return (T) queue[top];
        return null;
    }

    @Override
    public boolean isEmpty() {
        return queue == null || top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void empty() {
        top = -1;
    }

    private void grow() {
        Object[] queue2 = new Object[(queue.length * 2)];
        for (int i = 0; i < queue.length; i++) {
            queue2[i] = queue[i];
        }
        queue = queue2;
    }
}
