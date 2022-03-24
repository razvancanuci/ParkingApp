package com.example;
public class SmallPlace implements ParkingPlace {
    boolean reserved=false;
    String personName="";
    public SmallPlace()
    {
        
    }
    @Override
    public boolean isFit(VehicleType car)
    {
        return car==VehicleType.motorcycle;
    }

    public void reservePlace(String name)
    {
        reserved=true;
        personName=name;
    }
    public boolean isFitForVIP(VehicleType car)
    {
        return isFit(car);
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

