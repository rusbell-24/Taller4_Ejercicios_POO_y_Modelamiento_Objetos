package edu.sofka.exercise1;

public class Planet {
    private double dough;
    private double density;
    private double diameter;
    private double distanceToTheSun;
    private int id;
    private String name;

    public Planet(
            String name,
            int id,
            double dough,
            double density,
            double diameter,
            double distanceToTheSun
    ) {
        this.name = name;
        this.id = id;
        this.dough = dough;
        this.density = density;
        this.diameter = diameter;
        this.distanceToTheSun = distanceToTheSun;
    }

    public double getDough() {
        return dough;
    }

    public void setDough(double dough) {
        this.dough = dough;
    }


    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
