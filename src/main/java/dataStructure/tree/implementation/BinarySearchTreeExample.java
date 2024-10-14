package dataStructure.tree.implementation;

import com.sun.source.tree.BinaryTree;

public class BinarySearchTreeExample {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        // Binary Search Trees (Traverse)
        intTree.traverseInOrder();
        System.out.println();

        System.out.println(30);
        System.out.println(32);
        System.out.println(145214);

        // Binary Search Trees (Get, Min, Max)
        System.out.println("Min :-  " + intTree.min());
        System.out.println("Max :-  " + intTree.max());

        // Binary Search Tree (Delete)
        intTree.traverseInOrder();
        System.out.println();
        intTree.delete(30);
        intTree.traverseInOrder();
        System.out.println();

        System.out.print("inOrder  ");  // Order: Left → Root → Right
        intTree.traverseInOrder();
        System.out.println();
        System.out.print("PreOrder  ");     // Order: Root → Left → Right
        intTree.traversePreOrder();
        System.out.println();
        System.out.print("PostOrder  ");       // Order: Left → Right → Root
        intTree.traversePostOrder();


        /*
        Visit Pre-order - where
        you visit root first, Then left of that root then next root if available then it's left again
        Now if it's left is not available
        Then you will move to root And will move towards right
        Will continue the same until every node and it's leaf get completed

        Traversal Type	    Order	                Example
        Inorder         	Left → Root → Right	    2, 3, 4, 5, 7, 8
        Pre order	        Root → Left → Right	    5, 3, 2, 4, 7, 8
        Post order	        Left → Right → Root	    2, 4, 3, 8, 7, 5

        */
    }


}
