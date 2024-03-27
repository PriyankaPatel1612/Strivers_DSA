import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class printAllDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();
        printDivisors(num);
        System.out.println(printDivisors2(num));
        System.out.println(printDivisors3(num));
    }

    static void printDivisors(int n){
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    public static List<Integer> printDivisors2(int n) {
        List<Integer> li = new ArrayList<>();
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                li.add(i);
            }
        }
        return li;
    }

    //optimal solution
    public static List<Integer> printDivisors3(int n){
        List<Integer> li = new ArrayList<>();

        for(int i=1 ; i<=(int)Math.sqrt(n) ; i++){
            if(n%i==0){
                //System.out.println(i);
                li.add(i);
                if(n/i!=i){
                    //System.out.println(n/i);
                    li.add(n/i);
                }
            }
        }
        Collections.sort(li);
        return li;
    }
}
