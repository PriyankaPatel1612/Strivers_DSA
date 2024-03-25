import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digits = scan.nextInt();
        System.out.println(countDigits(digits));
    }

    //approach1
    static int countDigits(int digits){
        int count=0;
        while(digits>0){
            count++;
            digits/=10;
        }
        return count;
    }

    //approach2
    static int countDigits2(int digits){
        String str1 = Integer.toString(digits);
        return str1.length(); 
    }

    //approach2
    static int countDigits3(int digits){
        int count = (int) Math.floor(Math.log10(digits) + 1);
        return count;
    }


}