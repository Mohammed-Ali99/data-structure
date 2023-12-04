package com.dataStructure.list;

public class LinkedList<T> {
    Node<T> firstNode;
    Node<T> lastNode;
    String name;

    public LinkedList() {
        this("linkedList");
    }
    public LinkedList(String nameList) {
        firstNode = lastNode = null;
        name = nameList;
    }


    public void insertAtFront(T insertItem) {
        if(isEmpty()) {
            firstNode = lastNode = new Node<T>(insertItem);
        } else {
            firstNode = new Node<T>(insertItem , firstNode);
        }
    }

    public void insertFromBack(T insertItem) {
        if(isEmpty()) {
            firstNode = lastNode = new Node<T>(insertItem);
        } else {
            lastNode = lastNode.nextNode = new Node<T>(insertItem);
        }
    }

    public T removeAtFront() {
        if (isEmpty()) {
            throw new EmptyListException();
        }

        T removedItem = firstNode.data;
        if(firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }

        return removedItem;
    }

    public T removeFromBack() {
        if(isEmpty()) {
            throw new EmptyListException();
        }

        T removedItem = lastNode.data;
        if(firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            Node<T> current = firstNode;
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }
            lastNode = current;
            current.nextNode = null;
        }
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if(isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: " , name);

        Node<T> current = firstNode;
        while (current != null) {
            System.out.printf("%s " , current.data);
            current = current.nextNode;
        }
        System.out.println();

    }

}
