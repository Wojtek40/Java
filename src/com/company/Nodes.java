package com.company;

public class Nodes<T1> {
    public static <T2> Node <T2> create(T2 element){
        return new Node<T2>(element);
    }
    public static <T2> Node <T2> link (Node<T2> element, Node<T2> element2) {
        element.next = element2;
        return element;
    }

//    public static <T2> Node<T2> pairOf(Node<T2> element, Node<T2> element2) {
//        element2 = link(element2, element);
//        return link(element, element2);
//    }
    public static <T2> Node<T2> pairOf(T2 element, T2 element1) {
        return link(create(element), create(element1));
    }
    public static <T2> Node<T2> closedPairOf(T2 element, T2 element1) {
        Node first = create(element);
        Node secon = create(element1);

        secon = link(secon, first);
        return link(first, secon);
    }
}
