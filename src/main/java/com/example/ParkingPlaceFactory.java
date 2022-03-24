package com.example;
public class ParkingPlaceFactory {
    
    public static ParkingPlace GetPlace(int number)
    {
        switch(number)
        {
            case 0:
                return new SmallPlace();
            case 1:
                return new MediumPlace();
            case 2:
                return new LargePlace();
            default:
                return null;
        }
    }



}
