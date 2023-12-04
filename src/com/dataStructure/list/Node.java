package com.dataStructure.list;

class Node<T> {
    T data;
    Node<T> nextNode;

    Node (T object) {
        this(object, null);
    }

    Node(T object , Node<T> node) {
        data = object;
        nextNode = node;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

}
