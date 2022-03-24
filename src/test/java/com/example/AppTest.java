package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void factoryTest()
    {
        ParkingPlace p=ParkingPlaceFactory.GetPlace(1);
        assertFalse("Merge",p.isReserved());
    }
    @Test
    public void placeTest()
    {
        Park p=new Park();
        assertTrue(p.placeInThePark(new Person("Vasile", VehicleType.car, true)));
    }
}
