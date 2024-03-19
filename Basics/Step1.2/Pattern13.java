/*
 n=4
  1
  2 3
  4 5 6
  7 8 9 10
 */
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        int count=0;
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
