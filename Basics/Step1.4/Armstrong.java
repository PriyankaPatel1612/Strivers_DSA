import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();
        System.out.println(checkArmstrong(num));
    }

    static boolean checkArmstrong(int num){
        int count = countDigits(num);
        double cubeOfNum = 0;
        int dup = num;

        while(num!=0){
            int digits = num%10;
            cubeOfNum += Math.pow(digits, count);
            num/=10;
        }

        if(cubeOfNum==dup)
        return true;
        else
        return false;
    }

    //count digits
    static int countDigits(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
}
