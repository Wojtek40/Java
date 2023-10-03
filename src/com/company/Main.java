package com.company;

public class Main {


    public static void main(String[] args) {
//        ćwiczenia

/*        GenericHolder<Integer> genericHolder = new GenericHolder(213);
        System.out.println(genericHolder.getObj() + 1);
        System.out.println(genericHolder.getObj().getClass().getSimpleName());
        genericHolder.setObj(333);
        System.out.println(genericHolder.getObj());
        System.out.println(genericHolder.getObj().getClass().getSimpleName());

        ObjectHolder objectHolder = new ObjectHolder(2000);
        System.out.println((int)objectHolder.getObj() + 1);
        System.out.println(objectHolder.getObj().getClass().getSimpleName());

        objectHolder.setObj(333);
        System.out.println((int) objectHolder.getObj() + 1);
        System.out.println(objectHolder.getObj().getClass().getSimpleName());*/

        /** Zadanie 1.1 - 1.2 */

/*        Compare MyComparator = new Compare();
        MyComparator.compareValues(1,1);
        MyComparator.compareValues(1.1d,2.2d);
        MyComparator.compareValues(1.0f,0.1f);
        MyComparator.compareValues((byte)1, (byte)2);
        MyComparator.compareValues("00001", "2");*/

/*
        * Zadanie 1.3
*/
//        Compare MyComparator = new Compare();
//        MyComparator.compareValues(new Car("BMW", 100.1d, 100, 100), new Car("AUDI", 100d, 100, 100));
//        MyComparator.compareValues(new Car("BMW", 100, 101, 100), new Car("AUDI", 100, 100, 100));
//        MyComparator.compareValues(new Car("BMW", 100, 100, 999), new Car("AUDI", 100, 101, 100));
//        MyComparator.compareValues(new Car("BMW", 100.1f, 100, (byte)101), new Car("AUDI", 100.1f, 100, (byte)100));
        Node n4 = Nodes.create(25);
        Node n1 = Nodes.create(48);

        Node n5 = Nodes.link(n1, n4);
        Node n6 = Nodes.link(Nodes.create(10), Nodes.create(20));
    }
}
