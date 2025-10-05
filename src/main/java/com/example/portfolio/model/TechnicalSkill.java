package com.example.portfolio.model;

public class TechnicalSkill {
    private String name;
    private int percentage;

    public TechnicalSkill() {
    }

    public TechnicalSkill(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
