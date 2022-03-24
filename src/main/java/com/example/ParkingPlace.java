package com.example;
public interface ParkingPlace {
    boolean isFit(VehicleType car);
    void reservePlace(String name);
    boolean isFitForVIP(VehicleType car);
    boolean isReserved();
    String getName();
    void freePlace();
    
}
