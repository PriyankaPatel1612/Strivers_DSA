// Given an array, we have found the number of occurrences of each element in the array.

import java.util.HashMap;

public class Ques5 {
    static void findOccurences(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            //if exist-->update
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{   //if not exist-->add
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        findOccurences(arr);
    }
}
