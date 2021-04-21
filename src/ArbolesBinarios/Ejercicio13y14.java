package ArbolesBinarios;

import java.util.ArrayList;

public class Ejercicio13y14<T> {

    //Ejercicio13:
    private int height;

    public int size(BinaryTree a) {
        if (a.isEmpty())
            return 0;
        else
            return 1 + size(a.getLeft()) + size(a.getRight());
    }

    public int leavesAux(BinaryTree<T> a, int count) {
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
            return 1 + ocurrencias(a.getLeft(), o) + ocurrencias(a.getRight(), o);
        else
            return ocurrencias(a.getLeft(), o) + ocurrencias(a.getRight(), o);
    }

    public int elementsInLevel(BinaryTree<T> a, int level) {
        if (a.isEmpty())
            return 0;
        if (level == 0)
            return 1;
        return elementsInLevel(a.getLeft(), level - 1) + elementsInLevel(a.getRight(), level - 1);
        /*
        if (level > 1) {
            return elementsInLevel(a.getLeft(), level - 1) + elementsInLevel(a.getRight(), level - 1);
        } else {
            return a.getRoot() == null ? 0 : 1;
        }*/
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

    //Ejercicio14:

    public int elementSum
            (BinaryTree<Integer> a) {
        if (!(a.isEmpty())) {
            sum += a.getRoot();
        }
        if (!a.getLeft().isEmpty()) {
            sum += elementSum(a.getLeft());
        }
        if (!a.getLeft().isEmpty()) {
            sum += elementSum(a.getLeft());
        }
        return sum;
    }

    public int elementSum3(BinaryTree<Integer> a) {
        if (a.isEmpty())
            return 0;
        if(a.getRoot() % 3 == 0){
            return a.getRoot() + elementSum3(a.getRight()) + elementSum3(a.getLeft());
        }
        return  elementSum3(a.getRight()) + elementSum3(a.getLeft());
    }

    public boolean equals(BinaryTree<T> a, BinaryTree<T> b) {
        if (size(a) != size(b))
            return false;
        if (a.isEmpty())
            return b.isEmpty();
        if (!a.getRoot().equals(b.getRoot()))
            return false;
        if (a.getLeft().isEmpty() && a.getRight().isEmpty())
            return b.getRight().isEmpty() && b.getLeft().isEmpty();
        if (a.getLeft().isEmpty())
            return b.getLeft().isEmpty() && equals(a.getRight(), b.getRight());
        if (a.getRight().isEmpty())
            return b.getRight().isEmpty() && equals(a.getLeft(), b.getLeft());
        return equals(a.getLeft(), b.getLeft()) && equals(a.getRight(), b.getRight());
    }

    public boolean isomorfs(BinaryTree<T> a, BinaryTree<T> b) {
        if (size(a) != size(b))
            return false;
        if (a.isEmpty())
            return b.isEmpty();
        if (b.isEmpty())
            return a.isEmpty();
        return isomorfs(a.getRight(), b.getRight()) && isomorfs(a.getLeft(), b.getLeft());
    }

    public boolean similar(BinaryTree<T> a, BinaryTree<T> b) {
        if (size(a) == size(b) && !(equals(a, b))) ;
        return true;
    }

    public boolean complete(BinaryTree<T> a) {
        if (a.isEmpty())
            return false;
        if (a.getLeft().isEmpty()) {
            return a.getRight().isEmpty();
        }
        if (a.getRight().isEmpty()) {
            return a.getLeft().isEmpty();
        }
        return complete(a.getLeft()) && complete(a.getRight());
    }

    public boolean full(BinaryTree<T> a) {
        int h = height(a);
        if (a.isEmpty()) {
            return false;
        }
        return elementsInLevel(a, h) == Math.pow(2, h);
    }

    public boolean stable(BinaryTree<Integer> a) {
        if (a.isEmpty() || (size(a))== 1 || fatherIsHigher(a)){
            return true;
        }else{
            return false;
        }
    }

    private boolean fatherIsHigher(BinaryTree<Integer> a) {
        if (!a.getRight().isEmpty()) {
            if (a.getRoot() <= a.getRight().getRoot()) {
                return false;
            } else {
                return true;
            }
        }
        if (!a.getLeft().isEmpty()) {
            if (a.getRoot() <= a.getLeft().getRoot()) {
                return false;
            }
            else{
                return true;
            }
        }else{
            return false;
        }

    }


    public boolean ocurreArbin(BinaryTree<T> a, BinaryTree<T> b) {
        if (b.isEmpty()) {
            return false;
        }
        if (!a.getLeft().isEmpty()) {
            return ocurreArbin(a.getLeft(), b);
        }
        if (!a.getRight().isEmpty()) {
            return ocurreArbin(a.getRight(), b);
        }
        return true;
    }


    public void showFrontier(BinaryTree<T> a) {
        for (int i = 0; i < frontier(a).size(); i++) {
            System.out.println(frontier(a).get(i));
        }
    }


    public ArrayList<T> frontier(BinaryTree<T> a) {
        ArrayList<T> list = new ArrayList<>();
        addFrontierList(a,list);
        return list;
    }

    private void addFrontierList(BinaryTree<T> a, ArrayList<T> list) {
        if(a.isEmpty()){
            return;
        }
        if(a.getLeft().isEmpty() && a.getRight().isEmpty()){
            list.add(a.getRoot());
        }
        addFrontierList(a.getLeft(),list);
        addFrontierList(a.getRight(),list);
    }

}
