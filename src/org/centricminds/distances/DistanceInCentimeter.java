package org.centricminds.distances;

public class DistanceInCentimeter extends Distance {

    DistanceInCentimeter()
    {
        super("cm");
    }

    @Override
    public float getMeters()
    {
        return value/100;
    }

}
