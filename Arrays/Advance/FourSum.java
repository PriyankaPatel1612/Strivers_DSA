import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FourSum {

    //optimal (similar appraoch as three sum optimal solution)
    static List<List<Integer>> findFourSum(int[] nums, int target){
        //ans list
        List<List<Integer>> ans = new ArrayList<>();

        //sort array
        Arrays.sort(nums);

        //pointers
        //i-->0 to n-1
        //j-->i+1 to n-1
        for(int i=0 ; i<nums.length ; i++){
            //check for duplicates of i
            if(i>0 && nums[i]==nums[i-1])
            continue;

            //condition for j 
            for(int j=i+1 ; j<nums.length ; j++){
                int k=j+1;
                int l=nums.length-1;
                //check for duplicates of j
                if(j>i+1 && nums[j]==nums[j-1])
                continue;
                //run until k<l
                while(k<l){
                    long sum =(long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];  //using long because of integer overflow
                    if(sum<target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }else{
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        //check duplicates for k and l
                        while(k<l && nums[k]==nums[k-1])
                        k++;
                        while(k<l && nums[l]==nums[l+1])
                        l--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = findFourSum(nums,target);
        System.out.println(ans);
    }
}
