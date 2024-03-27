import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();
        System.out.println(sumOfDivisors(num));
    }

    static int sumOfDivisors(int n){
        int sum=0;
        while(n>=1){
            for(int i=n ; i>=1 ; i--){
                if(n%i==0){
                    sum = sum + i;
                }
            }
            n--;
        }
        return sum;
        
    }
}
