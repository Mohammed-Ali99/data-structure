package com.dataStructure.list;

public class CompositionStack<T> {
    LinkedList<T> list;

    public CompositionStack() {
        list = new LinkedList<T>("stack");
    }

    public void push(T insertItem) {
        list.insertAtFront(insertItem);
    }

    public T pop() throws EmptyListException{
        return list.removeAtFront();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void print() {
        list.print();
    }


}
