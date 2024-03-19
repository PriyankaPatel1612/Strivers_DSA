/*Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.



1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet. */

import java.util.Scanner;

public class UserInputOutput{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

        System.out.print((ch>='A' && ch<='Z') ? "1" : ((ch>='a' && ch<='z') ? "0" : "-1" ));
        

    }
}
