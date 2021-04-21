package binaryTree;

import ArbolesBinarios.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    private Ejercicio13y14<Integer> tree = new Ejercicio13y14<>();
    private ArrayList<Integer> array = new ArrayList<>();

    private BinaryTree<Integer> binaryTree = new BinaryTree<>(5,
            new BinaryTree<>(1,
                    new BinaryTree<>(3),
                    new BinaryTree<>(9,
                            new BinaryTree<>(8),
                            new BinaryTree<>())),
            new BinaryTree<>(7,
                    new BinaryTree<>(6),
                    new BinaryTree<>(2)));

    private BinaryTree<Integer> binaryTree2 = new BinaryTree<>(5, //igual al binaryTree
            new BinaryTree<>(1,
                    new BinaryTree<>(3),
                    new BinaryTree<>(9,
                            new BinaryTree<>(8),
                            new BinaryTree<>())),
            new BinaryTree<>(7,
                    new BinaryTree<>(6),
                    new BinaryTree<>(2)));

    private BinaryTree<Integer> binaryTree1 = new BinaryTree<>(5, //igual al binaryTree pero tiene un numero menos
            new BinaryTree<>(1,
                    new BinaryTree<>(3),
                    new BinaryTree<>(9,
                            new BinaryTree<>(8),
                            new BinaryTree<>())),
            new BinaryTree<>(7,
                    new BinaryTree<>(6),
                    new BinaryTree<>(1)));

    private BinaryTree<Integer> shortTree = new BinaryTree<>(6, new BinaryTree<>(5), new BinaryTree<>(9));
    private BinaryTree<Integer> emptyTree = new BinaryTree<>();
    private BinaryTree<Integer> oneElementTree = new BinaryTree<>(4);
    private BinaryTree<Integer> majorTree = new BinaryTree<>(6, new BinaryTree<>(4), new BinaryTree<>(2));

    @Test
    public void size() {
        assertEquals(8, tree.size(binaryTree));
        assertEquals(0, tree.size(emptyTree));
    }

    @Test
    public void ocurrencias() {
        assertEquals(1, tree.ocurrencias(binaryTree, 8));
        assertEquals(2, tree.ocurrencias(binaryTree1, 1));
        assertEquals(0, tree.ocurrencias(shortTree, 3));
    }

    @Test
    public void elementSum() {
        assertEquals(41, tree.elementSum(binaryTree));
        assertEquals(40, tree.elementSum(binaryTree1));
        assertEquals(20, tree.elementSum(shortTree));
    }

    @Test
    public void elementSum3() {
        assertEquals(18, tree.elementSum3(binaryTree));
        assertEquals(18, tree.elementSum3(binaryTree));
        assertEquals(15, tree.elementSum3(shortTree));
    }

    @Test
    public void equals() {
        assertTrue(tree.equals(binaryTree, binaryTree2));
        assertFalse(tree.equals(binaryTree, binaryTree1));
    }

    @Test
    public void isomorfs() {
        assertTrue(tree.isomorfs(binaryTree, binaryTree1));
        assertTrue(tree.isomorfs(binaryTree, binaryTree2));
        assertFalse(tree.isomorfs(shortTree, binaryTree2));
        assertFalse(tree.isomorfs(shortTree, emptyTree));
    }

    @Test
    public void similar() {
        assertTrue(tree.isomorfs(binaryTree, binaryTree1));
        assertTrue(tree.isomorfs(binaryTree, binaryTree2));
        assertFalse(tree.isomorfs(shortTree, binaryTree2));
        assertFalse(tree.isomorfs(shortTree, emptyTree));
    }

    @Test
    public void full() {
        assertFalse(tree.full(binaryTree));
        assertFalse(tree.full(shortTree));
    }

    @Test
    public void stable() {
        assertTrue(tree.stable(emptyTree));
        assertTrue(tree.stable(oneElementTree));
        assertTrue(tree.stable(majorTree));
        assertFalse(tree.stable(binaryTree));
    }

    @Test
    public void ocurreArbin() {
        assertTrue(tree.ocurreArbin(majorTree, oneElementTree ));
    }

    @Test
    public void frontier() {
        array.add(3);
        array.add(8);
        array.add(6);
        array.add(2);
        assertEquals(array , tree.frontier(binaryTree));
    }

}
