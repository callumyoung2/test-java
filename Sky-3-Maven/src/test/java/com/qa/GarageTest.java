package com.qa;

import com.qa.max.Garage;
import com.qa.max.vehicle.Boat;
import com.qa.max.vehicle.Car;
import com.qa.max.vehicle.Plane;
import com.qa.max.vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GarageTest {

    private Garage testGarage;


    @BeforeEach
    void setUp() {
        testGarage = new Garage();

        testGarage.addVehicle(new Car(4, "red"));
        testGarage.addVehicle(new Boat(0, "White"));
        testGarage.addVehicle(new Plane(6, "Polka Dots"));

    }

    @Test
    void testAddVehicle() {

        Assertions.assertTrue(this.testGarage.addVehicle(new Car(4, "blue")));

    }

    @Test
    void testEmpty() {
        Assertions.assertTrue(this.testGarage.empty());
    }


    @Test
    void calcBillInstanceTest() {
        Assertions.assertEquals(48, this.testGarage.calcBillInstance());
    }

    @Test
    void testFind() {
        Vehicle testVehicle = new Boat(0, "White");
        testVehicle.setId(2);
        Assertions.assertEquals(testVehicle, this.testGarage.find(2));
    }
}
