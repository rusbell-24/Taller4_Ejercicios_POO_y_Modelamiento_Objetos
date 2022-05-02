package edu.sofka.exercise4;

import java.util.Calendar;

public abstract class Vehicle {
    private Integer numberOfPassengers;
    private boolean manned = false;
    private Calendar registrationDate;
    private String displacementMedium;
    private Integer velocity;
    private String color;
    private String mark;

    public abstract void moveAlong();
}
