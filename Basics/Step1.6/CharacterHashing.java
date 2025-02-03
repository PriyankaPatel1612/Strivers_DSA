import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // input String
        System.out.print("Enter String : ");
        String str = scan.next();

        //pre-compute
        int[] hash = new int[26];
        for(int i=0 ; i<str.length() ; i++){
            hash[str.charAt(i)-'a']+=1;
        }

        //input queries
        System.out.print("Enter queries : ");
        int q = scan.nextInt();

        while(q-- != 0){
            //input num
            char character = scan.next().charAt(0);
            System.out.println("Occurence " + hash[character-'a']); 
        }

    }
}
