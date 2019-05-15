package org.centricminds.distances;

public abstract class Distance implements Comparable<Distance> {
    protected float value;
    protected String type;

    protected  Distance(String type)
    {
        this.type = type;
    }

    //abstract method that will convert a value to base unit (in meter)
    public abstract float getMeters();

    public void setValue(float value)
    {
        this.value = value;
    }


    @Override
    public int compareTo(Distance d)
    {
        Float f1 = getMeters();
        Float f2 = d.getMeters();
        int retval = f1.compareTo(f2);
        if (retval == 0)
        {
            System.out.println("duplicate value found!! " + f1);
        }
        return retval;
    }

    @Override
    public String toString() {
        return Float.toString(value) + " " + type;
    }

    @Override
    public int hashCode()
    {
        return Float.valueOf(getMeters()).hashCode();
    }


    @Override
    public boolean equals(Object ob)
    {
        Distance dist = (Distance)ob;
        return Float.valueOf(getMeters()).equals(dist.getMeters());
    }
}
