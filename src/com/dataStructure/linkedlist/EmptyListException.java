package com.dataStructure.linkedlist;

public class EmptyListException extends RuntimeException{
    public EmptyListException() {
        this("list");
    }

    public EmptyListException(String nameList) {
        super(nameList + " is empty");
    }


}
