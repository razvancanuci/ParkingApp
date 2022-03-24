package com.example;
public class LargePlace implements ParkingPlace {
    boolean reserved=false;
    String personName="";
    public LargePlace()
    {
        
    }
    public boolean isFit(VehicleType car)
    {
        return car==VehicleType.truck;
    }
    public void reservePlace(String name)
    {
        reserved=true;
        personName=name;
    }
    public boolean isFitForVIP(VehicleType car)
    {
        return true;
    }

    public boolean isReserved() 
    {

        return reserved;
    }
    public String getName()
    {
        return personName;
    }
    public void freePlace()
    {
        personName="";
        reserved=false;
    }
}
