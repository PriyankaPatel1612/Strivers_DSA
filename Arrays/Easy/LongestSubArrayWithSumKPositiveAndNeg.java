import java.util.HashMap;

public class LongestSubArrayWithSumKPositiveAndNeg {

    //optimized selftested
    static int findLongestSubarray(int[] A, int k){

        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        int len = 0 , sum = 0, maxLen=0;
        //traverse
        for(int i=0 ; i<A.length ; i++){

            //find sum
            sum = sum+A[i];

            if(sum==k){
                maxLen = Math.max(maxLen, i+1);
            }

            //pre sum
            int rem = sum - k;

            //if map contains pre sum then find length and check max
            if(preSumMap.containsKey(rem)){
                len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len); 
            }

            //put if pre sum is not exist
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
       return maxLen; 
    }
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int k = 1;
        System.out.println(findLongestSubarray(arr, k));
        
    } 
}
