package org.centricminds.distances;

public class DistanceInMeter extends Distance {

    DistanceInMeter()
    {
        super("m");
    }

    @Override
    public float getMeters()
    {
        return value;
    }
}
