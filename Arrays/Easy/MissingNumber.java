import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    //brute force approach selftested
    static int findMissingNumber3(int[] nums){

        List<Integer> list = new ArrayList<>();

        //copy
        for(int it : nums){
            list.add(it);
        }
        System.out.println(list);

        //check
        int n = nums.length;
        for(int i=1 ; i<=n ; i++){
            if(!list.contains(i))
            return i;
        }
        return -1;
    }

    //optimal1
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

    //optimal2 
    //XOR of (XOR of n numbers and XOR of array elements) 
    //a^a = 0, a^0=a
    //--------------for better understanding--------------//
    /*
    //finding xor of 1 to n 
     int xor1 = 0;
    int resultXOR1 = 0;
    for(int i=1 ; i<=nums.length ; i++){
        resultXOR1 = xor1^i;
        System.out.println(xor1 + "^" + i + " == " +   resultXOR1  + " ");
        xor1 = xor1^i;                  
    }
    System.out.println();

    //finding xor of array elements
    int xor2 = 0;
    int resultXOR2 =0;
    for(int i=0 ; i<nums.length ; i++){
        resultXOR2 = xor2^nums[i];
        System.out.println(xor2 + "^" + nums[i] + " == " +   resultXOR2  + " ");
        xor2 = xor2^nums[i];
    }

    //xor of array elements and 1ton
    int xor = xor1^xor2;
    */

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

        int num = findMissingNumber2(nums);
        System.out.println(num);
    }
}
