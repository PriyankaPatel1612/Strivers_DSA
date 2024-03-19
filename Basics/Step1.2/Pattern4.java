/*
 
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
