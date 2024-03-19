/*

--->Right Angle Number Pyramid<---

 1
 1 2
 1 2 3 
 1 2 3 4
 1 2 3 4 5
 */

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
