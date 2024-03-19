/*
 *****
  ***
   *
 */
import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        
        for(int row=n ; row>=1 ; row--){
            //spaces
            for(int sp=1 ; sp<=n-row ; sp++){
                System.out.print(" ");
            }
            //stars
            for(int st=1 ; st<=2*row-1 ; st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
