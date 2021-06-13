package com.maghi711.lambdas.domain;

public class Apple {
    private String name;
    private int weight;
    private String color;

    public Apple(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorWeight() {
        return this.getColor() + "\t" + this.getWeight();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", color='").append(color).append('\'');
        sb.append("}");
        return sb.toString();
    }
}
