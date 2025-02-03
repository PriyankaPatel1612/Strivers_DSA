import java.util.HashMap;

public class CountSubarraysWithSumK {

    //brute force selftested
    static int countSubarrays(int[] arr, int k){
        int sum;
        int count = 0; 
        for(int i=0 ; i<arr.length ; i++){
            sum = 0;
            for(int j=arr.length-1 ; j>i ; j--){
                sum+=arr[j];
                if(sum == k){
                    count++;
                }
            }  
        }
        return count;
    }

    //optimized selftested using hashmap
    static int countSubarrays2(int[] arr, int k){
        int preSum = 0, subArrCount=0;
        //create hashmap of presum and count
        HashMap<Integer,Integer> map = new HashMap<>();
        //put 0,1
        map.put(0, 1);
        //update presum by traversing
        for(int i=0 ; i<arr.length ; i++){

            preSum+=arr[i];
            //find x-k
            int rem = preSum - k;
            //if presum exist in map then increase count and update count
            subArrCount+=map.getOrDefault(rem, 0);
            //if not then put presum with count 1
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }
        return subArrCount;
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,4};
        int count = countSubarrays2(arr, 6);
        System.out.println(count);
    }
}
