import java.util.Arrays;
import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        recursiveFunc(n);
        System.out.println();
        System.out.println(Arrays.toString(printNums(n)));
        System.out.println(Arrays.toString(printNos(n)));
    }

    //----------------------------------//
    static void recursiveFunc(int n){
        if(n<1)
        return;

        System.out.print(n);
        recursiveFunc(n-1);
    }

    //----------------------------//
    //returning array
    static int[] printNums(int n){
        int[] nums = new int[n];
        recFunc(n,n, nums);
        return nums;
    }

    static void recFunc(int n, int i, int[] nums){
        if(i<1)
        return;

        nums[i-1]=(n+1)-i;
        recFunc(n,i-1, nums);
    }

    //---------------------------//
    public static int[] printNos(int x) {
        int[] nums = new int[x];
        recFunc(x, nums);
        return nums;
    }

    static void recFunc(int n, int[] nums){
        if(n==0)
        return;

        nums[nums.length-n]=n;
        recFunc(n-1, nums);
    }
}
