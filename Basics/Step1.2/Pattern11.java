/*
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
 */
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                if((row+col)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            } 
            System.out.println();
        }

    }
}
