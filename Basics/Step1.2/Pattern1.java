/*

--->Rectangular Star Pattern<---

* * * * *
* * * * *
* * * * * 
* * * * *
* * * * *

*/

import java.util.Scanner;

class Pattern1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        for(int row=0 ; row<n ; row++){
            for(int col=0 ; col<n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}