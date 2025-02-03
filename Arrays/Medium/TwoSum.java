import java.util.Arrays;
import java.util.HashMap;

class TwoSum{
    //check 2Sum
    static int[] twoSum(int[] arr,int target){
       
        //selftested
        int[] indices = new int[2];
        //return indices
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]+arr[j] == target){
                    // flag = true;
                    indices[0] = i;
                    indices[1] = j;
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
        return indices;
    }

    //optimized
    static int[] twoSum2(int[] arr, int target){
        int[] indices = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            hm.put(arr[i],i);
        }
        System.out.println(hm);
        int i=0;
        int j=arr.length-1;

        //  i=first_index
        //  j=last_index
        //  sort
        //  while i < j
        //  sum<target--> i++ / sum>target--> j--

        Arrays.sort(arr);
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                indices[0] = hm.get(arr[i]);
                indices[1] = hm.get(arr[j]);
                break;
            }
            else if(sum<target){
                i++;
            }else{
                j--;
            }

        }
       
        return indices;

        //////////////////////////////////////
        /*
         *  int[] indices = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hm.containsKey(complement)) {
                indices[0] = hm.get(complement);
                indices[1] = i;
                return indices;  // Return the result as soon as we find the pair
            }
            hm.put(nums[i], i);
        }
        
        return indices; 
         */
        ////////////////////////////////////
    }
    public static void main(String[] args) {
        int targetSum=6;
        int[] arr = {3,3};
        int[] arr2 = twoSum2(arr,targetSum);
        for(int i : arr2){
            System.out.println(i);
        }
    }
}