package com.company;

public class Horse extends DomesticAnimal{

    private String color;

    public Horse(int weight, int age, char gender, String name,String Color) {

        this.color = color;
    }

    public Horse() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
