public class MissingNumber {
    //sum of n natural numbers - sum of array elements = missing number
    static int findMissingNumber(int[] nums){
        int n = nums.length;
        //sum of first natural number = (N*(N+1)/2)

        int s1 = n*(n+1)/2;
        int s2 = 0;
        for(int i=0 ; i<n ; i++){
            s2 = s2+nums[i];
        }

        int diff = s1-s2;
        
        return diff;
        
    }

    //XOR of (XOR of n numbers and XOR of array elements) 
    //a^a = 0, a^0=a
    static int findMissingNumber2(int[] nums){
        int xor1 = 0, xor2 = 0;
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            xor1 = xor1^(i+1);
            xor2 = xor2^nums[i];
        } 

        return xor1^xor2;
    }
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        //n=3 1+2+3=6
        //3+0+1=4
        //6-4=2

        int num = findMissingNumber2(nums);
        System.out.println(num);
    }
}
