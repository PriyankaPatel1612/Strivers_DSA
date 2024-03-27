import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int n2 = scan.nextInt();
        //brute force
        int ans = gcd(n1, n2);
        System.out.print("The GCD of the two numbers is "+ans);    
        //euclideans algo
        int ans2 = gcd2(n1, n2);
        System.out.println("The GCD of the two numbers is "+ans2);   
    }

    //brute force approach
    public static int gcd(int a,int b)
	{
        int num1 = 3, num2 = 6;
        int ans = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
           if (num1 % i == 0 && num2 % i == 0) {
           ans = i;
           }
        }
        return ans;

	}

    //euclideans algorithm
    static int gcd2(int a, int b) {
        if (b == 0) {
          return a;
        }
        return gcd(b, a % b);
    }
}
