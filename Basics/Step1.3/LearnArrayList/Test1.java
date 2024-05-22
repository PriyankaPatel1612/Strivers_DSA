import java.util.ArrayList;
import java.util.Collections;

public class Test1{
    public static void main(String[] args) {
        
        //---------Integer arraylist--------//
        ArrayList<Integer> IntegerList = new ArrayList<>();
        //adding elements
        IntegerList.add(1);
        IntegerList.add(22);
        IntegerList.add(45);
        
        //creating integer array
        Integer[] arr = {45,21,90};
        //adding array into list
        Collections.addAll(IntegerList,arr);
        //print
        System.out.println(IntegerList);

        //--------String arraylist-------//
        ArrayList<String> StringList = new ArrayList<>();
        StringList.add("first");
        StringList.add("second");
        StringList.add("third");

        //creating string array
        String[] strArr = {"fourth", "fifth"};
        //adding string array to list
        Collections.addAll(StringList,strArr);
        //print
        System.out.println(StringList);
         
    }
}