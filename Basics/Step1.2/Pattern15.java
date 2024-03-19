/*
 ABCDE
 ABCD
 ABC
 AB
 A
 */
import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        
        for(int row=1 ; row<=n ; row++){
        char ch = 65;
           for(int col=n ; col>=row ; col--){
            System.out.print(ch);
            ch++;
           }
           System.out.println();
        }
    }
}
