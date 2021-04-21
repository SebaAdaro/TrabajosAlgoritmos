package ArbolesBinarios;

public class BinaryTreeSorting {

    public void preorder(BinaryTree a) {
        if (!a.isEmpty()) {
            System.out.println(a.getRoot() + " ");
            preorder(a.getLeft());
            preorder(a.getRight());
        }
    }

    public void inorder(BinaryTree a) {
        if (!a.isEmpty()) {
            inorder(a.getLeft());
            System.out.println(a.getRoot() + " ");
            inorder(a.getRight());
        }
    }

    public void postorder(BinaryTree a) {
        if (!a.isEmpty()) {
            postorder(a.getLeft());
            postorder(a.getRight());
            System.out.println(a.getRoot() + " ");
        }
    }

    public void byLevels(BinaryTree a) {
        DynamicQueue cola = new DynamicQueue<>();
        cola.enqueue(a);

        while (!cola.isEmpty()) {
            try {
                a = (BinaryTree) cola.dequeue();
            } catch (IsEmptyException e) {
                e.printStackTrace();
            }

            System.out.println(a.getRoot());

            if (!a.getLeft().isEmpty()) {
                cola.enqueue(a.getLeft());
            }
            if (!a.getRight().isEmpty()) {
                cola.enqueue(a.getRight());
            }

            try {
                cola.dequeue();
            } catch (IsEmptyException e) {
                e.printStackTrace();
            }
        }
    }

}
