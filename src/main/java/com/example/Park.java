package com.example;
public class Park implements ProxyInterface {
    private ProxyInterface person;

    private final int[][] MATRIX=new int[][]{{0,0,0,0},{1,1,1,1},{2,2,2,2},{0,1,1,1}};
    
    private ParkingPlace[][] places=new ParkingPlace[MATRIX.length][MATRIX.length];

    public Park()
    {
        try{
            for(int i=0;i<MATRIX.length;i++)
            {   
                for(int j=0;j<MATRIX[i].length;j++)
                {
                    places[i][j]=ParkingPlaceFactory.GetPlace(MATRIX[i][j]);
                }
            }
        }catch(Exception exp)
        {
            
        }
        
    }
    public void setPerson(Person p)
    {
        person=p;
    }
    public boolean isVip() 
    {
        return person.isVip();
    }
    public boolean takenName(String s)
    {
        boolean repeated=false;
        for(int i=0;i<places.length && !repeated;i++)
        {
            for(int j=0;j<places[i].length && !repeated;j++)
            {
                if(places[i][j].getName().equals(s))
                {
                    repeated=true;
                }
            }
        }
        return repeated;
    }
    public boolean placeInThePark(Person p)
    {
        boolean foundPlace=false;
        setPerson(p);
        for(int i=0;i<places.length && !foundPlace;i++)
        {
            for(int j=0;j<places[i].length && !foundPlace;j++)
            {
                if(!places[i][j].isReserved() && places[i][j].isFit(getVehType()))
                {
                    places[i][j].reservePlace(person.getName());
                    foundPlace=true;
                }
            }
        }

        if(!foundPlace)
        {
            if(isVip())
            {
                for(int i=0;i<places.length && !foundPlace;i++)
                {
                    for(int j=0;j<places[i].length && !foundPlace;j++)
                    {
                        if(!places[i][j].isReserved() && places[i][j].isFitForVIP(getVehType()))
                        {
                            places[i][j].reservePlace(person.getName());
                            foundPlace=true;
                        }
                    }
                }
            }
        }
        return foundPlace;
    }
    public VehicleType getVehType() 
    {
        return person.getVehType();
    }
    public String getName()
    {
        return person.getName();
    }
    public boolean freePlace(String name)
    {
        boolean foundPlace=false;
        for(int i=0;i<places.length && !foundPlace;i++)
        {
            for(int j=0;j<places[i].length && !foundPlace;j++)
            {
                if(places[i][j].getName().equals(name))
                {
                    places[i][j].freePlace();
                    foundPlace=true;
                }
            }
        }
        return foundPlace;
    }
    
    

}

