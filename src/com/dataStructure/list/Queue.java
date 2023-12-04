package com.dataStructure.list;

public class Queue<T> {

    LinkedList<T> list;

    public Queue() {
        list = new LinkedList<T>("queue");
    }

    public void enqueue(T insertItem) {
        list.insertAtFront(insertItem);
    }

    public T dequeue() throws EmptyListException{
        return list.removeFromBack();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void print() {
        list.print();
    }

}
