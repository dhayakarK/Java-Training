package com.trimindtech.training.day03;

public class Animal {
    private String color;
    private String name;
    private boolean isCornivorous;
    private boolean isWildAnimal;
    private int livingSpan;

    public Animal(String color, String name, boolean isCornivorous, boolean isWildAnimal, int livingSpan) {
        this.color = color;
        this.name = name;
        this.isCornivorous = isCornivorous;
        this.isWildAnimal = isWildAnimal;
        this.livingSpan = livingSpan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCornivorous() {
        return isCornivorous;
    }

    public void setCornivorous(boolean cornivorous) {
        isCornivorous = cornivorous;
    }

    public boolean isWildAnimal() {
        return isWildAnimal;
    }

    public void setWildAnimal(boolean wildAnimal) {
        isWildAnimal = wildAnimal;
    }

    public int getLivingSpan() {
        return livingSpan;
    }

    public void setLivingSpan(int livingSpan) {
        this.livingSpan = livingSpan;
    }
}
