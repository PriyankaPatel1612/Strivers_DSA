import java.util.Scanner;

public class SumFirstN {
   static long sum = 0;
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    sumOfN(n);
    System.out.println(sum);
    System.out.println(sumOfN2(n, 0));
   }
   
   static void sumOfN(int n){
    if(n<1)
    return;
    sum+=n;
    sumOfN(n-1);
   }

   static int sumOfN2(int n, int sum){
    if(n==0)
    return sum;
    return sumOfN2(n-1, sum+n);
   }
}
