import java.util.HashMap;

public class LengthOfLongestSubarrayZeroSum {
    static int findMaxLength(int[] arr, int n){
        int maxLength = 0;
        int length = 0;
        int sum = 0;
        //create hashmap to store sum and its position
        HashMap<Integer,Integer> map = new HashMap<>();
       
        for(int i=0 ; i<arr.length ; i++){

             sum+=arr[i];
             //check if sum is already equals
             if(sum==0){
                maxLength = Math.max(maxLength, i+1);
             }
             //find sum-target
             int rem = sum-0;

             //check if rem is exist is map
             if(map.containsKey(rem)){
                // if exist then update length
                length = i-map.get(rem);
                maxLength = Math.max(maxLength, length);
             }

             //put sum in map 
             if(!map.containsKey(rem)){
                map.put(rem, i);
             }
        }
        return maxLength;
    }

    //main
    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        int n = arr.length;
        System.out.println(findMaxLength(arr,n));
        
    }
}
