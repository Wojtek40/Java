package com.company;

public class Car implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    private int id, masa, dlugosc, szerokosc;
    private String marka;

    public Car(int id, int masa, int dlugosc, int szerokosc, String marka) {
        this.id = id;
        this.masa = masa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.marka = marka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
