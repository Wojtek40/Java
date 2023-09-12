package com.company;

public class Compare {
    public Compare() {
    }
    public void compareValues(int a, int b) {
        if (a > b) {
            System.out.println("a = " + a + " jest większe od b = " + b);
        } else if (a < b) {
            System.out.println("a = " + a + " jest mniejsze od b = " + b);
        } else {
            System.out.println("a = " + a + " jest równe b = " + b);
        }
    }
    public void compareValues(float a, float b) {
        if (a > b) {
            System.out.println("a = " + a + " jest większe od b = " + b);
        } else if (a < b) {
            System.out.println("a = " + a + " jest mniejsze od b = " + b);
        } else {
            System.out.println("a = " + a + " jest równe b = " + b);
        }
    }
    public void compareValues(double a, double b) {
        if (a > b) {
            System.out.println("a = " + a + " jest większe od b = " + b);
        } else if (a < b) {
            System.out.println("a = " + a + " jest mniejsze od b = " + b);
        } else {
            System.out.println("a = " + a + " jest równe b = " + b);
        }
    }
    public void compareValues(byte a, byte b) {
        if (a > b) {
            System.out.println("a = " + a + " jest większe od b = " + b);
        } else if (a < b) {
            System.out.println("a = " + a + " jest mniejsze od b = " + b);
        } else {
            System.out.println("a = " + a + " jest równe b = " + b);
        }
    }
    public void compareValues(String a, String b) {
        if (a.compareTo(b) > 0) {
            System.out.println("a = " + a + " jest większe od b = " + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println("a = " + a + " jest mniejsze od b = " + b);
        } else {
            System.out.println("a = " + a + " jest równe b = " + b);
        }
    }
}
