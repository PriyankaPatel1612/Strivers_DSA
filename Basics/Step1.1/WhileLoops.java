/*Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.



Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

Constraints
0<= 'n' <=10000
 */
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int oddSum=0;
		int evenSum = 0;
		int digit = -1;

		while(n!=0){
			digit = n%10;
			if(digit%2==0){
				evenSum = evenSum + digit;
			}else {
				oddSum = oddSum + digit;
			}

			n = n/10;
		}

		System.out.println(evenSum + " " + oddSum);

	}
}
