

## INPUT
1. program requires input file for distances.
2. Each line the input file represent separate value. 
3. Format of the value is "\<number> \<unit>"
4. number is floating point value.
5. unit is one of the mm|cm|m|km.

## PROCESSING

### Architecture
1. Each distance is converted to basic unit for comparision (in meters).
2. Distance base class has all the implementation apart from conversion.
3. Each extension of Distance represent a separate unit of Distance which its implementation of getMeter().
4. DistanceFactory is used to parse the input line and create corresponding unit object.

### Algorithm
1. Main Sorting is done by iterating through input list.
2. On each iteration HashSet is inserted and a return list is pushed with value if its not already in HashSet.
3. Then return list is sorted using Collection.sort algorithm.
4. Implementation is returning list of same type as the type of input.

### Complexity
1. HashSet insertion is O(1).
2. So insertion is n*O(1) will be n, ignoring insertion in the list.
3. Collection.sort must be quick sort which has average complexity of n*logn
4. So complexity is n*logn.

## OUTPUT
1. Sorted List is displayed on the console.
2. If duplicate is found it will be printed on console.


## BUILDING
