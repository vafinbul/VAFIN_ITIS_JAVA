package com.company;

public class Stack {
    private String [] elements;
    private int count;
    public Stack(int capacity){
        elements = new String[capacity];
        count = 0;
    }
    void push(String elem){
        elements[count] = elem;
        count++;
    }
    String pop(){
        String elemToReturn = elements[count - 1];
        count--;
        return elemToReturn;
    }
    boolean isEmpty(){
        return this.count == 0;
    }
}
