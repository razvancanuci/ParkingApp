package com.example;
public class Person implements ProxyInterface {
    private String name;
    private VehicleType vehType;
    private boolean vip;

    public Person(String name,VehicleType type, boolean vip)
    {
        this.name=name;
        this.vip=vip;
        this.vehType= type;
    }
    public boolean isVip()
    {
        return vip;
    }
    public VehicleType getVehType()
    {
        return vehType;
    }
    public String getName()
    {
        return name;
    }
}
