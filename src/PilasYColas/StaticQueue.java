package PilasYColas;


public class StaticQueue <T> implements QueueInterface<T>{
    private T[] array;
    private int front;
    private int back;
    private int size;

    public StaticQueue() {
        array = (T[]) new Object[10];
        front = -1;
        back = -1;
        size = 0;
    }

    @Override
    public void enqueue(T element) {
        if(isEmpty()){
            back = 0;
            front = 0;
        }else{
            manageBack();
            ++back;
        }
        array[back] = element;
        ++size;
    }

    private void manageBack() {
        if(back+1 == size || back+1 == front){
            enlargeArray();
        }
    }

    @Override
    public T dequeue() throws IsEmptyException {
        if(!isEmpty()){
            T temp = array[front];
            manageFront();
            ++front;
            --size;
            return temp;
        }else{
            throw new IsEmptyException();
        }

    }

    private void manageFront() {
        if(front+1 == array.length){
            front = 0;
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

    private void enlargeArray(){ //cambiar para que lo copie en orden
        T[] arrayclone = array;
        array = (T[]) new Object[arrayclone.length +5];
        for (int i = 0; i < arrayclone.length; i++) {
            array[i]= arrayclone[front];
            if(front != arrayclone.length-1){
                ++front;
            }else{
                front = 0;
            }
        }
    }
}
