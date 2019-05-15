package org.centricminds.distances;

public class DistanceInMillimeter extends Distance{

    DistanceInMillimeter()
    {
        super("mm");
    }

    @Override
    public float getMeters()
    {
        return value/1000;
    }
}
