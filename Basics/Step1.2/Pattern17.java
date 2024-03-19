/*
    A
   ABA
  ABCBA
 ABCDCBA

 3 4-i 4-1
 2 4-2
 1 4-3
 0 4-4
 */
import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        char temp ='A';
        for(int row=1 ; row<=n ; row++){
           
            //spaces
            for(int sp=1 ; sp<=n-row ; sp++){
                System.out.print(" ");
            }  
            //first half
            char ch = 65;
            for(int i=1 ; i<=row ; i++){            
                System.out.print(ch);
                temp = ch;
                ch++;               
            }
            //next half
            for(int j=2 ; j<=row ; j++){
                temp--;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
