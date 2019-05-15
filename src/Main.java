import org.centricminds.distances.Distance;
import org.centricminds.distances.DistanceFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {

    static private List SortedListWithUniqueElements1(List input) throws Exception
    {
        HashSet distanceMap = new HashSet();
        List values = (List)Class.forName(input.getClass().getName()).newInstance();
        for (Object o: input)
        {
            if(!distanceMap.add(o))
            {
                System.out.println("duplicate value: " + o);
                continue;
            }
            values.add(o);
        }


        Collections.sort(values);
        return values;
    }

    static private List SortedListWithUniqueElements2(List input)
    {
        //Unsorted duplicated list
        System.out.println("Unsorted List:");
        System.out.println(input);

        //Sorted Unique list
        SortedSet sortedSet = new TreeSet<>();
        for(Object d: input)
        {
            sortedSet.add(d);
        }


        //Sorted List
        System.out.println("Sorted List:");

        List sortedList = new ArrayList<>();
        for(Object d: sortedSet)
        {
            sortedList.add(d);
        }

        return sortedList;

    }

    public static void main(String[] args) throws Exception {

        //file from which distances to be read
        File input = new File("datafile.txt");

        //input list for distances
        List<Distance> inputList = new ArrayList<>();

        //populate input list with values from file, in format of space seperated
        //value<space>unit
        try (BufferedReader br = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = br.readLine()) != null) {
                Distance newDistance = DistanceFactory.createDistance(line);
                inputList.add(newDistance);
            }
        }
        catch(Exception exception)
        {
            System.out.println("error in input processing!!!" + exception.getMessage());
        }


        System.out.println(SortedListWithUniqueElements1(inputList));

    }


}
