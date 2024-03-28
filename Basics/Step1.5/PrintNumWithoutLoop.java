import java.util.Arrays;

public class PrintNumWithoutLoop {
    //static int count=1, i=0;
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(printNums(9)));
        System.out.println(Arrays.toString(printNos(9)));
    }

    /*-----------correct solution-------------*/
    public static int[] printNos(int x) {

        // Declaring empty integer array
        int []ans = new int[x];
        // Calling recursive function
        recursiveFunction(x, ans);

        return ans;
    }

    public static void recursiveFunction(int x, int []ans) {
        if(x == 0) {
            return;
        }
        // Call recursive function
        recursiveFunction(x - 1, ans);
        // Insert element in the array
        ans[x - 1] =x;
    }

    //----------my solution-------------//
    /* 
    static int[] printNums(int n){
        int[] nums = new int[n];
        print1ton(nums,n);
        return nums;
    }

    static int[] print1ton(int[] nums, int n){
        if(i==n){
            return nums;
        }
        nums[i] = count;
        i++;
        count++;
        print1ton(nums, n);
        return new int[0];
    }
    */
}
