public class MaximumConsecutiveOnes {
    static int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int max_Count = 0;
        int n = nums.length;

        for(int i=0 ; i<n ; i++){
            
            if(nums[i]==1){
                count++;
            }else{
                if(count > max_Count){
                    max_Count = count;
               }
                count = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,0,1,1,1};
        int n = findMaxConsecutiveOnes(nums);
        System.out.println(n);
    }
}
