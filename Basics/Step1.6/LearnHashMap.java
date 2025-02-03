import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        //creation
        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("China", 130);
        map.put("america", 40);
        map.put("China", 150);  //it will update because key is already exist

        //searching
        if(map.containsKey("India")){
            System.out.println("contains key");
        }else{
            System.out.println("doesn't contains key");
        }

        //get
        System.out.println(map.get("China"));  //key exists
        System.out.println(map.get("Indonesia"));   //key not exist

        //iteration 1
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        } 

        //iteration 2
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        //removing
        map.remove("china");

        //print
        System.out.println(map);
    }
}
