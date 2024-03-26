import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();
        printReverse(n);  
        System.out.println(printReverse2(n));
        printReverse3(n);
        printReverse4(n);
    }

    //approach1
    static void printReverse(int n){
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        System.out.println(rev);
    }

    //approach2
    static int printReverse2(int n){
        int rev = 0;
        while(n!=0){
            int lastDigit = n%10;

            //check overflow & underflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; // Overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0; // Underflow
            }
            rev = rev*10 + lastDigit;
            n/=10;
        }
        return rev;
    }

    //approach3
    static void printReverse3(int n){
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        StringBuffer rev = sb.reverse();
        System.out.println(rev);
    }

    //approach4
    static void printReverse4(int n){
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        StringBuilder rev = sb.reverse();
        System.out.println(rev);
    }
}
