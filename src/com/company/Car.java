package com.company;

import java.time.LocalTime;

public class  Car<
        WeightType extends Number & Comparable,
        WidthType extends Number & Comparable,
        LengthType extends Number & Comparable> implements Comparable<Car>{

    @Override
    public int compareTo(Car car) {
        LocalTime myObj = LocalTime.of(15, 0);//LocalTime.now();

        if(myObj.isBefore(LocalTime.NOON)){
            return masa.compareTo(car.masa);
        } else {
            if (masa.compareTo(car.masa) == 0) {
                if (dlugosc.compareTo(car.dlugosc) == 0) {
                    return szerokosc.compareTo(car.szerokosc);
                }
                return dlugosc.compareTo(car.dlugosc);
            }
            return masa.compareTo(car.masa);
        }
    }


    private WeightType masa;
    private WidthType szerokosc;
    private LengthType dlugosc;
    private String marka;

    public Car(String marka, WeightType masa, LengthType dlugosc, WidthType szerokosc) {
        this.masa = masa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.marka = marka;
    }


    public Number getMasa() {
        return masa;
    }

    public void setMasa(WeightType masa) {
        this.masa = masa;
    }

    public LengthType getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(LengthType dlugosc) {
        this.dlugosc = dlugosc;
    }

    public WidthType getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(WidthType szerokosc) {
        this.szerokosc = szerokosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
