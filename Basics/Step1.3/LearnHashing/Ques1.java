//Given an integer array of size n, find all elements that appear more than [n/3] times.
//nums[1,3,2,5,1,3,1,5,1]

import java.util.HashMap;

public class Ques1 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);
    }

    public static void majorityElement(int[] nums){
        int n = nums.length;
        //key-nums , value-freq
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                //if exist-update (num,freq+1)
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                //if not exist add (num,1)
                map.put(nums[i], 1);
            }
        }

        //check
        for(int key : map.keySet()){
            if (map.get(key)>(n/3)) {
                System.out.print(key + " ");
            }
        }
    }
}
