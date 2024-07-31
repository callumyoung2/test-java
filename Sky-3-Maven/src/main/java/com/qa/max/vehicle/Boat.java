package com.qa.max.vehicle;

import java.util.Objects;

public class Boat extends Vehicle {


    private boolean sails;


    public Boat(int numWheels, String colour) {
        super(numWheels, colour);
    }

    public Boat(int numWheels, String colour, boolean sails) {
        super(numWheels, colour);
        this.sails = sails;
    }

    @Override
    public int calcBill() {
        return 15;
    }

    @Override
    public String toString() {
        return "Boat [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + ", id=" + this.getId() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boat boat = (Boat) o;

        return sails == boat.sails;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sails);
    }
}
