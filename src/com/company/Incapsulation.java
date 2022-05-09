package com.company;

public class Incapsulation {
    private String make;
    private String model;
    private int year;

    public Incapsulation(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void copy(Incapsulation incapsulation)
    {
        this.setMake(incapsulation.make);
        this.setModel(incapsulation.model);
        this.setYear(incapsulation.year);
    }
}
