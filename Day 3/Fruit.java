package com.app.fruits;

public class Fruit {
    private String name;
    private double weight;
    private String color;
    private boolean isFresh;

    public Fruit(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isFresh = true; // default to fresh
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        this.isFresh = fresh;
    }

    public String taste() {
        return "no specific taste";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }
}
