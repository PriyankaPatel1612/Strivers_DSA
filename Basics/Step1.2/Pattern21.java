import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        for(int row=1 ; row<=n ; row++){    
            for(int col=1 ; col<=n ; col++){
                if(row==1 || row==n || col==1 || col==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }     
            }System.out.println();
        }
    }    
}
