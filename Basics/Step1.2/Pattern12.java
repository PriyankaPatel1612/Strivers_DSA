/*
 1                 1
 1 2             2 1
 1 2 3         3 2 1
 1 2 3 4     4 3 2 1 
 1 2 3 4 5 5 4 3 2 1

 */

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        int temp =0;
        for(int row=n ; row>=1 ; row--){
            //first half
            for(int col=1 ; col<=n-(row-1) ; col++){
                System.out.print(col+" ");
                temp = col;
            }
            //spaces
            for(int sp=1 ; sp<=2*row-2 ; sp++){
                System.out.print("  ");
            }
            //second half
            for(int col=1 ; col<=n-(row-1) ; col++){
                System.out.print(temp+" ");
                temp--;
            }

            System.out.println();
        }
    }
}
