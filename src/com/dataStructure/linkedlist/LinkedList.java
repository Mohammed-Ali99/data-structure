package com.dataStructure.linkedlist;

public class LinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private String name;

    public LinkedList() {
        this("list");
    }

    public LinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
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
        if(isEmpty()) {
            throw new EmptyListException(name);
        }
        T removeItem = firstNode.data;

        if(firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }
        return removeItem;
    }

    public T removeFromBack() {
        if(isEmpty()) {
            throw new EmptyListException(name);
        }
        T removeItem = lastNode.data;

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
        return removeItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }


    public void print() {
        if(isEmpty()) {
            System.out.printf("Empty %s%n" , name);
        } else {
            System.out.printf("The %s is: " , name);
            Node<T> current = firstNode;
            while (current != null) {
                System.out.printf("%s " , current.getData());
                current = current.nextNode;
            }
            System.out.println();
        }
    }

}
