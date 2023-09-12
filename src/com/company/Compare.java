package com.company;

public class Compare {
//    public void compareValues(Integer a, Integer b) {
//        if (a > b) {
//            System.out.printf("a = %s jest większe od b = %s\n", a,  b);
//        } else if (a < b) {
//            System.out.printf("a = %s jest mniejsze od b = %s\n", a,  b);
//        } else {
//            System.out.printf("a = %s jest równe b = %s\n", a,  b);
//        }
//    }
//    public void compareValues(float a, float b) {
//        if (a > b) {
//            System.out.printf("a = %s jest większe od b = %s\n", a,  b);
//        } else if (a < b) {
//            System.out.printf("a = %s jest mniejsze od b = %s\n", a,  b);
//        } else {
//            System.out.printf("a = %s jest równe b = %s\n", a,  b);
//        }
//    }
//    public void compareValues(double a, double b) {
//        if (a > b) {
//            System.out.printf("a = %s jest większe od b = %s\n", a,  b);
//        } else if (a < b) {
//            System.out.printf("a = %s jest mniejsze od b = %s\n", a,  b);
//        } else {
//            System.out.printf("a = %s jest równe b = %s\n", a,  b);
//        }
//    }
//    public void compareValues(byte a, byte b) {
//        if (a > b) {
//            System.out.printf("a = %s jest większe od b = %s\n", a,  b);
//        } else if (a < b) {
//            System.out.printf("a = %s jest mniejsze od b = %s\n", a,  b);
//        } else {
//            System.out.printf("a = %s jest równe b = %s\n", a,  b);
//        }
//    }
//    public void compareValues(String a, String b) {
//        if (a.compareTo(b) > 0) {
//            System.out.printf("a = %s jest większe od b = %s\n", a,  b);
//        } else if (a.compareTo(b) < 0) {
//            System.out.printf("a = %s jest mniejsze od b = %s\n", a,  b);
//        } else {
//            System.out.printf("a = %s jest równe b = %s\n", a,  b);
//        }
//    }
    public <AnyType extends Comparable> void compareValues(AnyType a, AnyType b) {
        if (a.compareTo(b) > 0) {
            System.out.printf("a = %s jest większe od b = %s\n", a,  b);
        } else if (a.compareTo(b) < 0) {
            System.out.printf("a = %s jest mniejsze od b = %s\n", a,  b);
        } else {
            System.out.printf("a = %s jest równe b = %s\n", a,  b);
        }
    }
}
