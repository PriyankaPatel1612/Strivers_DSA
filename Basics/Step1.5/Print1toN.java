import java.util.Arrays;
import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter n: ");
       int n = scan.nextInt();
       System.out.println(Arrays.toString(printNums(n)));
    }

    static int[] printNums(int x){
       int[] nums = new int[x];
       recuFunction(nums, x);
       return nums;
    }

    static void recuFunction(int[] ans, int n){
        if(n==0) //base function
        return;

        //recursive function
        recuFunction(ans, n-1);

        //inserting element
        ans[n-1]=n;
    }
}
