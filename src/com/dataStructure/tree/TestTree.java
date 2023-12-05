package com.dataStructure.tree;

import java.security.SecureRandom;

public class TestTree {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom random = new SecureRandom();

        for (int i = 0 ; i < 10 ; ++i) {
            int value = random.nextInt(100);
            System.out.printf("%d " , value);
            tree.insertNode(value);
        }

        System.out.printf("%n%nPreorder traversal%n");
        tree.preOrderTraversal();

        System.out.printf("%n%nInorder traversal%n");
        tree.inOrderTraversal();

        System.out.printf("%n%nPostorder traversal%n");
        tree.postOrderTraversal();



    }

}
