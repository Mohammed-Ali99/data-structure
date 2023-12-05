package com.dataStructure.tree;

public class Tree<T extends Comparable<T>> {

    TreeNode<T> root;

    public Tree() {
        root = null;
    }

    public void insertNode(T insertValue) {
        if(root == null) {
            root = new TreeNode<T>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void preOrderTraversal() {
        preOrderHelper(root);
    }

    private void preOrderHelper(TreeNode<T> node) {
        if(node == null) return;

        System.out.printf("%s " , node.data);
        preOrderHelper(node.leftNode);
        preOrderHelper(node.rightNode);
    }

    public void inOrderTraversal() {
        inOrederHelper(root);
    }

    private void inOrederHelper(TreeNode<T> node) {
        if(node == null) return;

        inOrederHelper(node.leftNode);
        System.out.printf("%s " , node.data);
        inOrederHelper(node.rightNode);
    }

    public void postOrderTraversal() {
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode<T> node) {
        if (node == null) return;

        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.printf("%s " , node.data);

    }



}
