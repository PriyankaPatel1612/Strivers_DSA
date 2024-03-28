import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNameNTimes {
    static int count = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        //printName(n, "priya");
        //System.out.println(printNtimes(5));
        printNtimes(n);
        System.out.println();
        printNtimes2(1, n);
    }
    
    //------------solution1------------//
    /* 
    static void printName(int n, String name){
        if(count==n){
            return;
        }

        System.out.print(name + " ");
        count++;
        printName(n, name);
    }
    */

    //-----------solution2-----------//
    //returning list
    /* 
    public static List<String> printNtimes(int n){
        List<String> li = new ArrayList<>();
        recursiveFunction(n, li);
        return li;
    }

    public static void recursiveFunction(int n, List<String> li){
        if(count==n){
            return;
        }
        li.add("Code!");
        count++;
        recursiveFunction(n, li);
    }
    */

    //----------solution3-----------//
    public static void printNtimes(int n){
        System.out.print("Code ");

        // Recursively calling printNtimes as long as 'n' > 1.
        if(n>1)
            printNtimes(n-1);
    }

    //----------solution-5----------//
    public static void printNtimes2(int i, int n){
        // Base Condition.
        if(i>n) return;
        System.out.print("Code ");

        // Function call to print till i increments.
        printNtimes2(i+1,n);
    }
}
