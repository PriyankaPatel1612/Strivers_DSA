import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String to check pallindrome: ");
        String str = scan.next();

        //1st approach
        if(isPalindrome1(0,str))
        System.out.println("Pallindrome!!");
        else
        System.out.println("Not Pallindrome!!");

        //2nd approach
        if(isPalindrome2(str))
        System.out.println("Pallindrome!!");
        else
        System.out.println("Not Pallindrome!!");

        //3rd approach
        if(isPalindrome3(str))
        System.out.println("Pallindrome!!");
        else
        System.out.println("Not Pallindrome!!");
    }

    //1st approach
    static boolean isPalindrome1(int i, String str){
       int n = str.length();
       if(i>=n/2)
       return true;

       if(str.charAt(i)!=str.charAt(n-i-1))
       return false;

       return isPalindrome1(i+1, str);
    }

    //2nd approach
    static boolean isPalindrome2(String s){
        int left = 0, right = s.length()-1;
        while(left<right)
        {
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)) 
                left++;
            else if(!Character.isLetterOrDigit(r)) 
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
                return false;
            else {
                left++; 
                right--;
            }
        }
        return true;
    }

    //3rd approach
    public static boolean isPalindrome3(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }
}

