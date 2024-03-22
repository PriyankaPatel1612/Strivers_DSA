import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
    }

    static void printPattern(int n){
        // Outer loop for the no. of rows.
       for(int i=0;i<n;i++){
          
        // Inner loop for printing the alphabets from
        // A + N -1 -i (i is row no.) to A + N -1 ( E in this case).
        for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
            
            System.out.print(ch + " ");
        }
        
        // As soon as the letters for each iteration are printed, we move to the
        // next row and give a line break otherwise all letters
        // would get printed in 1 line.
        System.out.println();
    }
    }
}
