package org.centricminds.distances;


public class DistanceFactory {

    public static Distance createDistance(String distance) throws Exception
    {
        Distance retval = null;
        String [] token = distance.split(" ", 2);

        if (token.length != 2)
            throw new Exception("Invalid Distance format");

        float value = Float.parseFloat(token[0]);

        String type = token[1];
        if (type.equalsIgnoreCase("m"))
            retval = new DistanceInMeter();
        else if (type.equalsIgnoreCase("mm"))
            retval = new DistanceInMillimeter();
        else if (type.equalsIgnoreCase("cm"))
            retval = new DistanceInCentimeter();
        else if (type.equalsIgnoreCase("km"))
            retval = new DistanceInKilometer();
        else throw new Exception("Unkown unit type!!");

        retval.setValue(value);

        return retval;
    }

}
