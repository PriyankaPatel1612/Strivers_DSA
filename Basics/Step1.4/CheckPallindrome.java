import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        System.out.println(checkIfPallindrome(num));
        //System.out.println(checkIfPallindrome2(num));
        
    }

    static boolean checkIfPallindrome(int num){
        int rev = 0;
        int originalNum = num;

        if(num<0 || (num!=0 && num%10==10))
        return false;

        while(num!=0){
            int rem = num%10;
            rev = rev*10 + rem;
            num/=10;
        }

        if(rev==originalNum)
        return true;
        else
        return false;
    }

}
