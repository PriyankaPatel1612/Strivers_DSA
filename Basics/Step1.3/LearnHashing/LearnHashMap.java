/*
 * O(1)
 * put()
 * get()
 * containsKey()
 * remove()
 * size()
 * keySet()
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnHashMap {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China", 150);

        //print
        System.out.println(map);

        //it will update value
        map.put("China",180);
        System.out.println(map);
        /* if key already exist it will update the value
           if not exist it will add the key */

        //search
        if(map.containsKey("India")){
            System.out.println("map contains India key");
        }

        //get
        System.out.println(map.get("China"));
        System.out.println(map.get("America"));
        System.out.println();
        /*if key exist-- it will return value of that key
          if key doesn't exist it will return null */

        //iterate map
        //for(int value : arr)
        //entrySet - collection
        //Map.Entry<K,V> - type
        System.out.println("Iterating using entrySet");
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println("key:" + e.getKey() + ", value:" + e.getValue());
        }

        System.out.println();
        //iterate using set
        System.out.println("Iterating using set");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + ":" + map.get(key));
        }
        //iterate ways (only for understanding)
        /*for loop/ for each
        example
        int[] arr ={1,2,3,4,5};
        // for loop
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // for each
        for(int value : arr){
            System.out.print(value + " ");
        }
        */

        System.out.println();
        //remove
        map.remove("China");  //if we remove key, the corresponding value of that key is also deleted
        System.out.println("removed china");
        System.out.println(map);

    }
}
