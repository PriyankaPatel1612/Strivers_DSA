/*
 A
 BB
 CCC
 DDDD
 EEEEE
 */
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        char ch = 65;
        for(int row=1 ; row<=n ; row++){
           for(int col=1 ; col<=row ; col++){
            System.out.print(ch);
           }
           System.out.println();
           ch++;
        }

    }
}
