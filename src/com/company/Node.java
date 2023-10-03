package com.company;

public class Node<T> {
    protected T element;
    protected Node<T> next;

    protected Node(T element) {
        this.element = element;
        this.next = null;
    }

    protected Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

}
