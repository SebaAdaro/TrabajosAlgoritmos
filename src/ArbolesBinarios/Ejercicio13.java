package ArbolesBinarios;

public class Ejercicio13<T> {

    private int height;

    public int size(BinaryTree<T> a) {
        if (a.isEmpty())
            return 0;
        else
            return 1 + size(a.getLeft()) + size(a.getRight());
    }

    public int leavesAux(BinaryTree a, int count) {
        int counter = count;
        if (a.isEmpty()) {
            counter++;
        }
        if (!a.getLeft().isEmpty() && !a.getRight().isEmpty()) {
            return leavesAux(a.getLeft(), counter) + leavesAux(a.getRight(), counter);
        }
        return counter;
    }

    public int leaves(BinaryTree<T> a) {
        return leavesAux(a, 0);
    }

    public int ocurrencias(BinaryTree<T> a, T o) {
        if (a.isEmpty())
            return 0;
        if (a.getRoot().equals(o))
            return
                    1 + ocurrencias(a.getLeft(), o) + ocurrencias(a.getRight(), o);
        else
            return ocurrencias(a.getLeft(), o) + ocurrencias(a.getRight(), o);
    }

    public int elementsInLevel(BinaryTree<T> a, int b) {
        return 0;
    }

    public int height(BinaryTree<T> a) {
        height = 0;
        heightAux(a, 1);
        return height;
    }

    private void heightAux(BinaryTree<T> a, int i) {
        if (!a.isEmpty()) {
            heightAux(a.getLeft(), i + 1);
            if (i > height) {
                height = i;
            }
            heightAux(a.getRight(), i + 1);
        }
    }


}
