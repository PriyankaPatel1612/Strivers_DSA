/*

 *
 * *
 * * *
 * * * *
 * * *
 * *
 * 
 
 */

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        
        //first half
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //second half
        for(int row=n-1 ; row>=1 ; row--){
            for(int col=1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
