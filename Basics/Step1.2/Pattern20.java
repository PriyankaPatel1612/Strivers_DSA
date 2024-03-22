/*

 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * *     * * *  
 * *         * *
 *             *
 
 */

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){

        //first half
        int temp=2*n-2;
        for(int row=1 ; row<=n ; row++){    
           //stars
           for(int st=1 ; st<=row ; st++){
            System.out.print("* ");
           }
           //spaces
           for(int sp=1 ; sp<=temp ; sp++){
            System.out.print("  ");
           } 
           //stars
           for(int st=1 ; st<=row ; st++){
            System.out.print("* ");
           }
           System.out.println();
           temp-=2;
        }

        //next half
        for(int row=1 ; row<=n-1 ; row++){
            //stars
            for(int st=1 ; st<=n-row ; st++){
                System.out.print("* ");
            }
            //spaces
            for(int sp=1 ; sp<=2*row ; sp++){
                System.out.print("  ");
            }
            //stars
            for(int st=1 ; st<=n-row ; st++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
