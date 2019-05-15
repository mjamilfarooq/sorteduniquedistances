package org.centricminds.distances;

public class DistanceInKilometer extends Distance {

    DistanceInKilometer()
    {
        super("km");
    }

    @Override
    public float getMeters()
    {
        return value*1000;
    }
}
