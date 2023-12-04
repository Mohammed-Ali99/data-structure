package com.dataStructure.list;

import java.util.Stack;

public class StackInheritance<T> extends LinkedList<T> {

    public StackInheritance() {
        super("stack");
    }

    public void push(T insertItem) {
        insertAtFront(insertItem);
    }

    public T pop() {
        return removeAtFront();
    }
}
