package com.example.demo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private String car;
    private String color;
    private int year;
    private Date date = new Date();


    public Order(String car, String color, int year) {
        this.car = car;
        this.color = color;
        this.year = year;
    }

    public Order() {
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString(){
        return "Order{" +
                "car='" + car + '\'' +
                ", color=" + color +
                ", year=" + year +
                ", date=" + date +
                '}';
    }
}
