/*The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

    F(n) = F(n - 1) + F(n - 2), 
    Where, F(1) = 1, F(2) = 1


Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.

"Indexing is start from 1" */

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=1;
		int b=1;
	    int c=0;
		if (n==1)
		System.out.println(a);
		else{
		for(int i=2 ; i<n ; i++){
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println(c);
       }

    }
}
