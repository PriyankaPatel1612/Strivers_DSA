import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(computeFact(n, 1));
        
    }

    static int computeFact(int n, int fact){
        if(n<1)
        return fact;

        return computeFact(n-1, fact*n);
    }
}
