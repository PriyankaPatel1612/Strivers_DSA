/*
 * * * * * *
 * *     * *
 *         *
 *         *
 * *     * *
 * * * * * *
 * 
 */

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){

        //first half
        for(int row=1 ; row<=n ; row++){    
           //stars
           for(int st1=1 ; st1<=n+1-row ; st1++){
            System.out.print("*");
           }
           //spaces
           for(int sp=1 ; sp<=2*row-2 ; sp++){
            System.out.print(" ");
           }
           //stars
           for(int st2=1 ; st2<=n+1-row ; st2++){
            System.out.print("*");
           }
           System.out.println();
        }

        //second half
        int temp=2*n-2;       //for initial spaces
        for(int row=1 ; row<=n ; row++){    
           //stars
           for(int st1=1 ; st1<=row ; st1++){
            System.out.print("*");
           }
           //spaces
           for(int sp=1 ; sp<=temp ; sp++){
            System.out.print(" ");
           }
           //stars
           for(int st2=1 ; st2<=row ; st2++){
            System.out.print("*");
           }
           System.out.println();
           temp-=2;
        }
    }
}
