package ArbolesBinarios;

public class Node {

    private Object dato;
    private Node puntero;

    public Node() {
    }

    public Object getDato() {
        return dato;
    }

    public Node getPuntero() {
        return puntero;
    }

    public void setPuntero(Node puntero1) {
        puntero = puntero1;
    }

    public void setDato(Object element) {
        dato = element;
    }
}
