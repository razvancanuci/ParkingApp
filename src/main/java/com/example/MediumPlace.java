package com.example;
public class MediumPlace implements ParkingPlace {
    boolean reserved=false;
    String personName="";
    public MediumPlace()
    {
        
    }
    public boolean isFit(VehicleType car)
    {
        return car==VehicleType.car;
    }
    public void reservePlace(String name)
    {
        reserved=true;
        personName=name;
    }
    public boolean isFitForVIP(VehicleType car)
    {
        return isFit(car) || car==VehicleType.motorcycle;
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
