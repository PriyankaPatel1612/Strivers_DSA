/*Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.

If-else is one of the ways to implement them.
You are given two numbers 'a' and 'b'.
Compare the numbers and print the relation.
Print “smaller”, “greater” or “equal” when ‘a’ is smaller than ‘b’, greater than ‘b’, or equal to ‘b’ respectively. */
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(compareIfElse(a, b));
    }
    public static String compareIfElse(int a, int b) {
        
        return (a > b) ? "greater" : ((a < b) ? "smaller" : "equal");
    }
}
