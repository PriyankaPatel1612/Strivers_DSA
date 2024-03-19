/*
       *
      ***
     *****
*/
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        
        for(int row=1 ; row<=n ; row++){
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
