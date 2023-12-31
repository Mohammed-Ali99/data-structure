package com.dataStructure.tree;


class TreeNode<T extends  Comparable<T>> {
    TreeNode<T> leftNode;
    T data;
    TreeNode<T> rightNode;

    TreeNode(T nodeValue) {
        leftNode = rightNode = null;
        data = nodeValue;
    }

    public void insert(T insertValue) {
        if(insertValue.compareTo(data) < 0) {
            if(leftNode == null) {
                leftNode = new TreeNode<T>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        } else if(insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new TreeNode<T>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }

}
