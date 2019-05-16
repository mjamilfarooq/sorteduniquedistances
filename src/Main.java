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
        String listType = input.getClass().getName();
        List values = input.getClass().getDeclaredConstructor().newInstance();
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
        File input = new File(args[0]);

        //input list for distances
        List<Distance> inputList = new LinkedList<>();

        //populate input list with values from file, in format of space seperated
        //value<space>unit
        try (BufferedReader br = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = br.readLine()) != null) {
                Distance newDistance = DistanceFactory.createDistance(line);
                inputList.add(newDistance);
            }

            //Original List
            System.out.println(inputList);

            //Sorting
            List sortedUniqueList = SortedListWithUniqueElements1(inputList);
            System.out.println(sortedUniqueList);
        }
        catch(Exception exception)
        {
            System.out.println("error in input processing!!!" + exception.getMessage());
        }

    }


}
