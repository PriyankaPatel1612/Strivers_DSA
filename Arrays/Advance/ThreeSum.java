import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    static List<List<Integer>> threeSum1(int[] nums) {

        //set
        HashSet<List<Integer>> tripletSet = new HashSet<>();

       //pointers i and j
       for(int i=0 ; i<nums.length ; i++){
        HashSet<Integer> lookUpSet = new HashSet<>();
        for(int j=i+1 ; j<nums.length ; j++){
            int k = -(nums[i]+nums[j]);
            if(lookUpSet.contains(k)){
                List<Integer> li = Arrays.asList(nums[i],nums[j],k);
                li.sort(null);
                tripletSet.add(li);
            }
            lookUpSet.add(nums[j]);
        }
       }

       //set to list
       List<List<Integer>> ans = new ArrayList<>(tripletSet);
       //ans.addAll(tripletSet);
       return ans;
    }

    //optimal 
    //using three pointer
    static List<List<Integer>> threeSum2(int[] nums){
        
        //list
        List<List<Integer>> ans = new ArrayList<>();
        //sort
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length ; i++){
            //if i is duplicate
            if(i!=0 && nums[i]==nums[i-1]) continue; 

            int j=i+1;
            int k=nums.length-1;
            //run until j<k and check sum
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(li);
                    j++;
                    k--;

                    //ignore duplicates
                    while(j<k && nums[k]==nums[k+1])
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                    j++;

                }
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans1 = threeSum1(nums);
        System.out.println(ans1);
        List<List<Integer>> ans2 = threeSum2(nums);
        System.out.println(ans2);
    }
}
