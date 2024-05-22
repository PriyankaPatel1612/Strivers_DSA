/*
Declare an ArrayList of different Types
Add Element
Get Element
Add Element at a specific Index
Set Element at a specific Index
Delete Element from an Index
Size of the List
Loop/Iterate on the List
Sort the List
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        //Declare an ArrayList of different Types
        ArrayList<Integer> li1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<String> li2 = new ArrayList<>();
        ArrayList<Float> li3 = new ArrayList<>();
        ArrayList<Boolean> li4 = new ArrayList<>();
        ArrayList<Double> li5 = new ArrayList<>();

        //print
        System.out.println(li1);
        System.out.println(li2);
        System.out.println(li3);
        System.out.println(li4);
        System.out.println(li5);

        //Add Element
        li2.add("Shreya");
        li2.add("Priya");
        li2.add("Aman");
        System.out.println(li2);
        
        // Add Element at a specific Index
        li2.add(0,"Aadhya");
        System.out.println(li2);

        //Get Element
        System.out.println(li2.get(2));

        //Set Element at a specific Index
        li2.set(0,"Ansh");
        System.out.println(li2);

        // Delete Element from an Index
        li2.remove(1);
        System.out.println(li2);

        // Size of the List
        System.out.println(li2.size());

        // Loop/Iterate on the List
        for(int i=0 ; i<li2.size() ; i++){
            System.out.print(li2.get(i)+" ");
        }
        System.out.println();

        // Sort the List
        Collections.sort(li2);
        System.out.println(li2);

    }
   
}
