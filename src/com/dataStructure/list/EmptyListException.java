package com.dataStructure.list;

public class EmptyListException extends RuntimeException{

    public EmptyListException() {
        this("linkedlist");
    }

    public EmptyListException(String name) {
        super(name + " is empty");
    }

}
