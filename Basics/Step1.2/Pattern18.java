import java.util.Scanner;
/*
E 
D E 
C D E 
B C D E 
A B C D E
 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        printPattern(n);
        printPattern2(n);
    }

/*
E 
E D
E D C
E D C B
E D C B A
 */
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

    //another solution
    static void printPattern2(int n){
        for(int i=0;i<n;i++){

            char start = 'A';
            for(int k=0;k<n-1;k++){

                start += 1;

            }
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start -= 1;
            }
            System.out.println("");
        }    
    }
}
